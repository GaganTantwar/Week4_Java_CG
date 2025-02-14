package mapinterface;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts; // Stores accounts (AccountNumber -> Balance)
    private TreeMap<Integer, Double> sortedAccounts; // Sorts customers by balance
    private Queue<Integer> withdrawalQueue; // FIFO queue for withdrawal requests

    public BankingSystem() {
        this.accounts = new HashMap<>();
        this.sortedAccounts = new TreeMap<>(Comparator.comparing(accounts::get));
        this.withdrawalQueue = new LinkedList<>();
    }

    // Create a new account
    public void createAccount(int accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
            return;
        }
        accounts.put(accountNumber, initialBalance);
        updateSortedAccounts();
        System.out.println("Account " + accountNumber + " created with balance $" + initialBalance);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found.");
            return;
        }
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        updateSortedAccounts();
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    // Request withdrawal (adds to queue)
    public void requestWithdrawal(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found.");
            return;
        }
        withdrawalQueue.offer(accountNumber);
        System.out.println("Withdrawal request queued for account " + accountNumber);
    }

    // Process withdrawals
    public void processWithdrawals(double withdrawalAmount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            double balance = accounts.get(accountNumber);

            if (balance >= withdrawalAmount) {
                accounts.put(accountNumber, balance - withdrawalAmount);
                System.out.println("Withdrawal of $" + withdrawalAmount + " processed for account " + accountNumber);
            } else {
                System.out.println("Insufficient balance in account " + accountNumber);
            }
            updateSortedAccounts();
        }
    }

    // Get balance
    public double getBalance(int accountNumber) {
        return accounts.getOrDefault(accountNumber, 0.0);
    }

    // Get sorted accounts by balance
    public Map<Integer, Double> getSortedAccountsByBalance() {
        return sortedAccounts;
    }

    // Update sorted TreeMap when balance changes
    private void updateSortedAccounts() {
        sortedAccounts.clear();
        sortedAccounts.putAll(accounts);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Create accounts
        bank.createAccount(101, 500.0);
        bank.createAccount(102, 1200.0);
        bank.createAccount(103, 300.0);

        // Deposit money
        bank.deposit(101, 200.0);
        bank.deposit(103, 500.0);

        // Request withdrawals
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(101);

        // Process withdrawals
        bank.processWithdrawals(400.0);

        // Display sorted accounts
        System.out.println("Accounts sorted by balance: " + bank.getSortedAccountsByBalance());

        // Check balance of specific account
        System.out.println("Balance of account 101: $" + bank.getBalance(101));
    }
}

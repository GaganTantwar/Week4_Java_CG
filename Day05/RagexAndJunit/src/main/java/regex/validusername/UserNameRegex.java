package regex.validusername;
import java.util.regex.Pattern;

public class UserNameRegex {
    public static void userNameChecking(String userNames[]){
        String regex="^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
        Pattern pattern=Pattern.compile(regex);
        for(String username:userNames){
            System.out.println("Valid User Name "+pattern.matcher(username).matches());
        }
    }
    public static void main(String args[]){
        String []userNames={"user_89887","US","123user"};
        UserNameRegex.userNameChecking(userNames);
    }
}

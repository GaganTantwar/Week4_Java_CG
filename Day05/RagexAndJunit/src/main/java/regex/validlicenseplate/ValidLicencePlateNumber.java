package regex.validlicenseplate;
import java.util.regex.*;
public class ValidLicencePlateNumber {
    public static boolean checkNumberPlate(String plates[]){
        boolean ans=false;
        String regex="^[A-Z]{2}\\d{4}$";
        Pattern pattern=Pattern.compile(regex);
        for(String numberPlate:plates){
           if(pattern.matcher(numberPlate).matches()){
               System.out.println(numberPlate+"Number Plate is Valid: "+pattern.matcher(numberPlate).matches());
               ans=true;

           }
        }
        return ans;
    }
    public static void main(String args[]){
        String licenseNumbers[]={"AB1234","A2331","ABC3223"};
        boolean answer=ValidLicencePlateNumber.checkNumberPlate(licenseNumbers);
        System.out.println("Did Array Of Lincense Number Contains any Valid Number: "+answer);

    }
}

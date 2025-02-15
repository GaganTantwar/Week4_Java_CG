package regex.hexadecimalcharacters;
import java.util.regex.*;
public class HexadecimalCharacters {
    public static boolean checkHexadecimalCharacters(String hexarray[]){
        boolean ans=false;
        String regex="^[#][0-9a-fA-F]{6}$";
        Pattern pattern=Pattern.compile(regex);
        for(String hex:hexarray){
            if(pattern.matcher(hex).matches()){
                System.out.println(hex+" Number is Valid Hexadecimal: "+pattern.matcher(hex).matches());
                ans=true;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String []hexarray={"#FFA500","#ff4500","#123"};
        boolean answer=HexadecimalCharacters.checkHexadecimalCharacters(hexarray);
        System.out.println("Dis hexarray contains any hexadecimal Number: "+answer);
    }
}

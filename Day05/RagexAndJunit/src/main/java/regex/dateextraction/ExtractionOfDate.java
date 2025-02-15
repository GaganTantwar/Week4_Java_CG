package regex.dateextraction;
import java.util.regex.*;
public class ExtractionOfDate {
    public static boolean checkDate(String text){
        boolean ans=false;
        String regex="\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            ans=true;
            System.out.println("Date found: " + matcher.group());
        }
        return ans;
    }
    public static void main(String args[]){
        String text="Important dates: 12/05/2023, 15/08/2024, and 29/02/2020.";
        boolean ans=ExtractionOfDate.checkDate(text);
        System.out.println("Any Date Found: "+ans);
    }
}

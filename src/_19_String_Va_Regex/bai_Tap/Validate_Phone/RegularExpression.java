package _19_String_Va_Regex.bai_Tap.Validate_Phone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
       final String REGEX_PHONE = "\\d{2}-[0]\\d{9}";
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập vào số điện thoại (xx)-(0xxxxxxxxx): ");
       String inputphone = sc.nextLine();
       Pattern pattern = Pattern.compile(REGEX_PHONE);
       Matcher matcher = pattern.matcher(inputphone);

       if(matcher.matches()){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
    }
}

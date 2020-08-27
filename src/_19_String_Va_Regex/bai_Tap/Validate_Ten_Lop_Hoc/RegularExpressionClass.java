package _19_String_Va_Regex.bai_Tap.Validate_Ten_Lop_Hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionClass {
    public static void main(String[] args) {
        final String REGEX = "[CAP]\\d{3}[A-Z]";
           Scanner sc = new Scanner(System.in);
           // khởi tạo để biến string thành regex:
           System.out.println("Nhập vào tên lớp học: ");
           String str = sc.nextLine();
           Pattern pattern = Pattern.compile(REGEX);
           // đưa vào
           Matcher matcher = pattern.matcher(str);

           // so sánh
           if(matcher.matches()){
               System.out.println("true");
           }else {
               System.out.println("false");
           }





    }
}

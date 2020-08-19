package _13_ThuatToan_TimKiem.bai_Tap._1_Tim_Chuoi_Tang_Dan_Do_Lon_;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        // Create a Scanner:
        Scanner sc = new Scanner(System.in);

        // Prompt the user to Enter a string:
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        //Find the maximum increasingly ordered subsequenue:

        for (int i = 0; i < str.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++){
                if(str.charAt(j) > list.getLast() ){
                      list.add(str.charAt(j));
                }
            }

            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max){
            System.out.println(ch);
        }
        System.out.println();

    }
}

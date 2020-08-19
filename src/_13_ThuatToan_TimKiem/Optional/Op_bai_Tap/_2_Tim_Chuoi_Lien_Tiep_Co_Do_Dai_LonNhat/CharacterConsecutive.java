package _13_ThuatToan_TimKiem.Optional.Op_bai_Tap._2_Tim_Chuoi_Lien_Tiep_Co_Do_Dai_LonNhat;

import java.util.LinkedList;
import java.util.Scanner;

public class CharacterConsecutive {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();


        System.out.print("Enter a string: ");
        String string = sc.nextLine();


        for (int i = 0; i < string.length(); i++) { 		// single loop
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); // Simple statement
            }

            list.add(string.charAt(i)); // Simple statement

            if (list.size() > max.size()) { // Simple statement
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

package _11_DSA_Stack_Queue.bai_Tap._1_Reverse_Stack;

import java.util.Stack;

public class ReverserStack{
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0 ;i < 5; i++){
            stack1.add(i);
        }
        System.out.println(stack1);
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0 ;i < 5; i++){
            stack2.add(stack1.pop());
        }
        System.out.println(stack2);
        String str = "This is a Stack";
        String newStr = "";
        Stack<Character> wsTack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            wsTack.push(str.charAt(i));
        }
        System.out.println(wsTack);
        for (int i = 0; i < str.length(); i++){
            newStr += wsTack.pop();
        }
        System.out.println(newStr);


    }
}

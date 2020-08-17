package _11_DSA_Stack_Queue.Optional.OP_bai_Tap._2_Palindrome;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "I Like Ekko 3 sao";
        Stack stack = new Stack();
        Queue queue = new PriorityQueue();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            stack.push(c);
            queue.add(c);

        }
        String result = " Not palindrome";
        for (int i = 0; i < str.length()/2;i++ ){
            if(stack.pop().equals(queue.remove())) result ="Palindrome";
        }
        System.out.println(str);
        System.out.println(result);
    }
}

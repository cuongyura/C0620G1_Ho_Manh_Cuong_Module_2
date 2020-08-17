package _11_DSA_Stack_Queue.Optional.OP_bai_Tap._1_ChuyenDoi_ThapPhan_NhiPhan;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 20;
        Stack<Integer> stack = new Stack<>();
        while (num != 0){
            stack.push(num % 2);
            num /= 2;
        }
        String str = "";
        while (!stack.isEmpty()){
            str += stack.pop();
        }
        System.out.println(str);
    }
}

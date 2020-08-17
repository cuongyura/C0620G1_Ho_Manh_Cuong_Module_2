package _11_DSA_Stack_Queue.Optional.OP_bai_Tap._3_KiemTra_DauNgoac_Stack;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        System.out.println(checkBracket(str));
    }
    public static boolean checkBracket(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            boolean isOpenBracket = str.charAt(i) == '(';
            boolean isCloseBracket = str.charAt(i) == ')';
            if(isOpenBracket) stack.push('(');
            if(isCloseBracket){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return  stack.isEmpty();
    }
}

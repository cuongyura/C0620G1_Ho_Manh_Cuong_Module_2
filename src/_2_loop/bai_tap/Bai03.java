package _2_loop.bai_tap;

public class Bai03 {
    public static void main(String[] args) {
        int n = 500;
        int dem = 0;
        int i = 2;
        System.out.println("Số nguyên tố nhỏ hơn 100 là : ");
        while (dem < n){
            if(isPrimeNumber(i) && i < 100){
                System.out.print(i+ " ");
                dem++;
            }
            i++;
        }

    }
    public static boolean isPrimeNumber(int n){
        // n < 2 ko phải là số nguyên tố:
        if(n<2){
            return false;
        }
        // check số nguyên tố khi n > 2:
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}




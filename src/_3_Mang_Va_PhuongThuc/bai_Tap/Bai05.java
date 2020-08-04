package _3_Mang_Va_PhuongThuc.bai_Tap;

public class Bai05 {
    public static void main(String[] args){
        // Khởi tạo mảng:
        int[] array = {4,6,5,88,92,100,220};
        // In ra mảng:
        System.out.print("List Array: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("Giá trị nhỏ nhất là: "+giaTriNhoNhatTrongMang(array));



    }
    public static int giaTriNhoNhatTrongMang(int []array) {
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }
}

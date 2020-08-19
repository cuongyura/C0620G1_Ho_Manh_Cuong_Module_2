package _13_ThuatToan_TimKiem.Optional.Op_bai_Tap._1_ThuatToan_TimKiem_NhiPhan_SD_DeQuy;

public class MainTest {
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = ob.binarySeach(array, x, 0, n - 1);
        if (result == -1) System.out.println("Not found");
           else
            System.out.println("Element found at index "+ result);

    }
}

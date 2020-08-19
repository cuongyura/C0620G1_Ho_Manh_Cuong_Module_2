package _13_ThuatToan_TimKiem.Optional.Op_bai_Tap._1_ThuatToan_TimKiem_NhiPhan_SD_DeQuy;

public class BinarySearch {


    public static int binarySeach(int array[], int x, int low, int high){
        if(high >= low){

            int mid = low + (high - low)/2;

            if (array[mid] == x) return mid;

            if(array[mid] > x) return binarySeach(array, x, low, mid -1);

            return binarySeach(array, x, mid + 1, high);

        }
        return -1;
    }
}

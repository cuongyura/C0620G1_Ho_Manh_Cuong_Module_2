package _14__Sort__Algorithm.bai_Tap._1_MinhHoa_ThuatToan_SapXep;

import java.util.ArrayList;

public class MinhHoaChen {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(7);
        arr.add(3);
        arr.add(66);
        arr.add(10);
        System.out.println(arr);
    }
    public static void insertionSort(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            Integer selectedNum = arr.get(i);
            System.out.println("Key "+ selectedNum);
            int currentMaxIndex = i - 1;
            while (currentMaxIndex > -1){
                int compareNum = arr.get(currentMaxIndex);
                if(selectedNum < compareNum){
                    System.out.println(selectedNum+" < "+compareNum);
                    currentMaxIndex--;
                }else {
                    System.out.println(selectedNum+" > "+compareNum);
                    break;
                }
            }
            arr.add(currentMaxIndex + 1, selectedNum);
            arr.remove(i + 1);
            System.out.println(arr);

        }
    }
}

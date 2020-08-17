package _11_DSA_Stack_Queue._GenericTest;

import java.util.ArrayList;

public class GenericTest {
    // Mục đích nó đại diện kiểu dữ liệu tương ứng
    public <T>void showArrayElement(T[] objects){
          for (T o : objects){
              System.out.println(o);
          }
    }
    public <K, V> void showInfo(K key, V value){
        System.out.println(key+" : "+value);
    }
    public <T extends Comparable<T>> T finalMax(T[] arr){
        T max = arr[0];
        for (int i = 0; i < arr.length;i++){
             if(arr[i].compareTo(max) > 0){
                 max = arr[i];
             }
        }
        return max;
    }
    public static void main(String[] args) {
        // Nó sẽ giới hạn kiểu chấp nhận của A
        // Mặc định nó sẽ chấp nhận các string
        // Generic sẽ làm đơn giản chương trình đi
        // 1.Giới hạn các kiểu sẽ được chấp nhận ở trong lớp hoặc phương thức
        // 2. Cho phep viết 1 lần , nhưng có thể áp dụng các kiểu dữ liệu khác nhau.
        /*
        ArrayList<String> list = new ArrayList<>();
        // Thêm một phần tử:
        list.add("hahaaaaha");
        list.add(24);
        list.add(new Object());
        */
        Integer[] integers = {1,2,3,4,5,6,7,8,9};

        String[] strings = {"Apple", "Papaya", "Banana"};
        Double[] doubles = {3.25, 6.3, 4.12, 9.78};
        GenericTest test = new GenericTest();
        /*test.showArrayElement(integers);
        test.showArrayElement(doubles);
        test.showArrayElement(strings);*/
        test.showInfo(1, "one");
        test.showInfo(5, "Five");
        test.finalMax(integers);
        var max = test.finalMax(integers);
        System.out.println("Max = "+max);
    }
}

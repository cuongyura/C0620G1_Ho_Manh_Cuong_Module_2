package _3_Mang_Va_PhuongThuc.bai_Tap;

public class Bai08 {
    public static void main(String[] args) {
      String str = "Hello world";
        System.out.println("Chuỗi là: "+str);
        demKyTuTrongMang(str);
    }

    public static void demKyTuTrongMang(String str) {
        int counter[] = new int[256];
        /*Khai báo chiều dài của chuỗi: */
        int len = str.length();
        /*duyệt chuỗi: */
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;

        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                flag++;
                if (str.charAt(i) == array[j]) {
                    System.out.println("Số lần xuất hiện của: " + str.charAt(i) +
                            " tron chuỗi: " + counter[str.charAt(i)]);
                }
            }

        }
    }
}

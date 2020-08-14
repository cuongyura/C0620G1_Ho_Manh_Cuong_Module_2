package _10_DAD_List.bai_Tap.MainTest;


import _10_DAD_List.bai_Tap._1_Method_ArrayList.SinhVienTestLinkedList;
import _10_DAD_List.bai_Tap._2_TrienKhai_LinkedList.BaiTapMyLinkedList;

public class MainTest {
    public static void main(String[] args) {
        SinhVienTestLinkedList sinhVien_1 = new SinhVienTestLinkedList("Chẳng");
        SinhVienTestLinkedList sinhVien_2 = new SinhVienTestLinkedList("Nhớ");
        SinhVienTestLinkedList sinhVien_3 = new SinhVienTestLinkedList("Nổi");
        SinhVienTestLinkedList sinhVien_4 = new SinhVienTestLinkedList("Một");
        SinhVienTestLinkedList sinhVien_5 = new SinhVienTestLinkedList("Người");

        BaiTapMyLinkedList<Object> baiTapMyLinkedList = new BaiTapMyLinkedList<>();
        baiTapMyLinkedList.addFirst(sinhVien_2);
        baiTapMyLinkedList.addFirst(sinhVien_1);
        baiTapMyLinkedList.addLast(sinhVien_3);
        baiTapMyLinkedList.add(sinhVien_5,3);
        baiTapMyLinkedList.add(sinhVien_4,3);
        baiTapMyLinkedList.printList();

        System.out.println(baiTapMyLinkedList.remove(sinhVien_3));
        baiTapMyLinkedList.printList();

        System.out.println(baiTapMyLinkedList.remove(1));
        baiTapMyLinkedList.printList();

        System.out.println(baiTapMyLinkedList.get(1));
        System.out.println(baiTapMyLinkedList.size());

        System.out.println(baiTapMyLinkedList.contains(sinhVien_1));

        baiTapMyLinkedList.clone().printList();

        System.out.println(baiTapMyLinkedList.IndexOf(sinhVien_5));
    }
}

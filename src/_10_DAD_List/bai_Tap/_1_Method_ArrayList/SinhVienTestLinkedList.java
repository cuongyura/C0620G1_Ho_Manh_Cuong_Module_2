package _10_DAD_List.bai_Tap._1_Method_ArrayList;

public class SinhVienTestLinkedList {
    private String name;

    SinhVienTestLinkedList() {
    }

    public SinhVienTestLinkedList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

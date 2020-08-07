package _5_access_Modifier_Static_Method_Staticproperty.thuc_Hanh;

public class A {
    // private : mức độ truy cập ở lớp:
    // pulic : công cộng
    // proctecd những lớp thừa kế :
    private int a = 60;
    public int b = 50;
    protected int data = 40;
    protected void mgs(){
        System.out.println("Hello java");
    }
}
 class Simple extends A{
     public static void main(String[] args) {
         A obj = new A();
         System.out.println(obj.data);
         obj.mgs();

     }
}

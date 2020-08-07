package _5_access_Modifier_Static_Method_Staticproperty.thuc_Hanh;

public class Student {
    // thuộc tính:
    private int rollno;
    private String name;
    public static String collecge = "BBDIT";

    //constructor to initialize the variable:
    Student(int r , String n){
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        collecge = "CODEGYM";
    }
    void dislay(){
        System.out.println(rollno+" "+name+" "+collecge);
    }

}
  class TestStaticMethod{
      public static void main(String[] args) {
          // Gọi phương thức method:
          Student.change();
          Student s1 = new Student(111,"Hoang");
          Student s2 = new Student(222,"Khanh");
          Student s3 = new Student(333,"Nam");
          s1.dislay();
          s2.dislay();
          s3.dislay();
      }
  }

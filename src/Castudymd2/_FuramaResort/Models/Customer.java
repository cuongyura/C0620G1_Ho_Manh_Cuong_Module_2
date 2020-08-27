package Castudymd2._FuramaResort.Models;

public class Customer {
    // thuộc tính:
    
    private String nameCustomer;
    private String birthDay;
    private String sex;
    private String cmnd;
    private String phone;
    private String email;
    private String typeCustomer;
    private String address;
    private Services useService;

    // costructor:


    public Customer() {

    }

    public Customer(String nameCustomer, String birthDay, String sex, String cmnd, String phone, String email, String typeCustomer, String address, Services useService) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.useService = useService;
    }

    public Customer(String nameCustomer, String birthDay, String sex, String cmnd, String phone, String email, String typeCustomer, String address, String useService) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }


    // get,set:


    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public String showInfor(){
        return
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", useService=" + useService;
    }


}

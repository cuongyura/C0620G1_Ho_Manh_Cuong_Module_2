package Castudymd2._FuramaResort.Controllers;

import Castudymd2._FuramaResort.Models.*;
import _11_DSA_Stack_Queue._GenericTest.GenericTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainController {
    // Tạo đường dẫn file:

    public static final String ROOM_CSV = "E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\Castudymd2\\_FuramaResort\\Data\\Room.csv";
    public static final String HOUSE_CSV = "E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\Castudymd2\\_FuramaResort\\Data\\House.csv";
    public static final String VILLA_CSV = "E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\Castudymd2\\_FuramaResort\\Data\\Villa.csv";
    public static final String CUSTOMER_CSV = "E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\Castudymd2\\_FuramaResort\\Data\\Customer.csv";

    public static void main(String[] args) throws IOException {
        Customer customer = new Customer();
        addCustomer();
        System.out.println(customer.showInfor());
    }


    public static void displayMainMenu(){
         Scanner sc = new Scanner(System.in);
            int menuChoice;
            do {
                System.out.println("\n\n\t*-*_*-*_*-*Menu*-*_*-*_*-*"
                                  +"\n\t1. Add New Services"
                                  +"\n\t2. Show Services"
                                  +"\n\t3. Add New Customers"
                                  +"\n\t4. Show Information of Customer"
                                  +"\n\t5. Add New Blocking"
                                  +"\n\t6. Show Information of Employee"
                                  +"\n\t7. Exit");
                System.out.println("Enter choose menu: ");
                menuChoice = sc.nextInt();
                switch (menuChoice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    default:
                        break;
                }
            } while (menuChoice != 7);


    }
    // add villa:

    public static void addVilla() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        System.out.println("Enter nameService: ");
        String nameService = sc.nextLine();
        System.out.println("Enter areaUse: ");
        double areaUse = sc.nextDouble();
        System.out.println("Enter costOfUse");
        double costOfUse = sc.nextByte();
        System.out.println("Enter maximumNumber: ");
        int maximumNumber = sc.nextInt();
        System.out.println("Enter rentalType: ");
        String rentalType = sc.nextLine();
        System.out.println("Enter standardRoom: ");
        String standardRoom = sc.nextLine();
        System.out.println("Enter descriptionConvenient: ");
        String descriptionConvenient = sc.nextLine();
        System.out.println("Enter areaPool: ");
        double areaPool = sc.nextDouble();
        System.out.println("Enter numberFlool");
        int numberFlool = sc.nextInt();

          // Khởi tạo đối tượng Services Villa:

          Villa villa = new Villa(id, nameService, areaUse, costOfUse, maximumNumber, rentalType, standardRoom, descriptionConvenient, areaPool, numberFlool);

           String[] array = villa.showInFor().split(",");

            FileWriter villaWriter = new FileWriter(VILLA_CSV, true);

             for (int i = 0; i < array.length; i++){
                 villaWriter.append(array[i]);
                 if(i != array.length - 1) villaWriter.append(",");
                 else villaWriter.append('\n');
               }




    }

    // add room:

    public static void addRoom() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        System.out.println("Enter nameService: ");
        String nameService = sc.nextLine();
        System.out.println("Enter areaUse: ");
        double areaUse = sc.nextDouble();
        System.out.println("Enter costOfUse");
        double costOfUse = sc.nextByte();
        System.out.println("Enter maximumNumber: ");
        int maximumNumber = sc.nextInt();
        System.out.println("Enter rentalType: ");
        String rentalType = sc.nextLine();
        System.out.println("Enter servicesFree: ");
        String servicesFree = sc.nextLine();

        Room room = new Room(id, nameService, areaUse, costOfUse, maximumNumber, rentalType, servicesFree);

        String[] array = room.showInFor().split(",");

        FileWriter villaWriter = new FileWriter(ROOM_CSV, true);

        for (int i = 0; i < array.length; i++){
            villaWriter.append(array[i]);
            if(i != array.length - 1) villaWriter.append(",");
            else villaWriter.append('\n');
        }

    }

    // add house:
    public static void addHouse() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        System.out.println("Enter nameService: ");
        String nameService = sc.nextLine();
        System.out.println("Enter areaUse: ");
        double areaUse = sc.nextDouble();
        System.out.println("Enter costOfUse");
        double costOfUse = sc.nextByte();
        System.out.println("Enter maximumNumber: ");
        int maximumNumber = sc.nextInt();
        System.out.println("Enter rentalType: ");
        String rentalType = sc.nextLine();
        System.out.println("Enter standardRoom: ");
        String standardRoom = sc.nextLine();
        System.out.println("Enter descriptionConvenient: ");
        String descriptionConvenient = sc.nextLine();
        System.out.println("Enter numberFlool");
        int numberFlool = sc.nextInt();

        House house = new House(id, nameService, areaUse, costOfUse, maximumNumber, rentalType, standardRoom, descriptionConvenient, numberFlool);

        String[] array = house.showInFor().split(",");

        FileWriter villaWriter = new FileWriter(HOUSE_CSV, true);

        for (int i = 0; i < array.length; i++) {
            villaWriter.append(array[i]);
            if (i != array.length - 1) villaWriter.append(",");
            else villaWriter.append('\n');
        }
    }
        // add customrer

        public static void addCustomer() throws IOException {

            Scanner sc = new Scanner(System.in);
            String id;
            boolean flag;
            do {
                final String REGEX_ID = "\\d{9}";
                System.out.println("Enter ID is: ");
                id = sc.nextLine();
                Pattern pattern = Pattern.compile(REGEX_ID);
                Matcher matcher = pattern.matcher(id);
                flag = matcher.matches();
                if (!flag) System.out.println("Error! Is card have 9 number! ");
            }while (!flag);
            String nameCustomer;

            do {
                final String REGEX_CUSTOMER = "[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
                System.out.println("Enter Name Customer is: ");
                nameCustomer = sc.nextLine();
                Pattern pattern = Pattern.compile(REGEX_CUSTOMER);
                Matcher matcher = pattern.matcher(nameCustomer);
                flag = matcher.matches();
                if (!flag) System.out.println("Error! ");
            }while (!flag);
            flag = false;
            String birthDay;
            do{
                final String REGEX_EMAIL = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
                System.out.println("Enter birthDay is: ");
                birthDay = sc.nextLine();
                Pattern pattern = Pattern.compile(REGEX_EMAIL);
                Matcher matcher = pattern.matcher(birthDay);
                flag = matcher.matches();

                if(!flag) System.out.println("Error! birthday have format dd/MM/yyyy ");;
            }while(!flag);
            flag = false;
            String gender;
            do{
                    final String REGEX_GENDER = "^Male$|^Female$|^Unknow$|^uNKNOW$|^mALE$|^fEMALE$";
                System.out.println("Enter gender is: ");
                gender = sc.nextLine();
                gender = gender.toLowerCase();
                gender = Character.toUpperCase(gender.charAt(0)) + gender.substring(1);
                Pattern pattern = Pattern.compile(REGEX_GENDER);
                Matcher matcher = pattern.matcher(gender);
                flag = matcher.matches();

                if(!flag) System.out.println("Error!");;
            }while(!flag);
            System.out.println("Enter cmnd is: ");
            String cmnd = sc.nextLine();
            System.out.println("Enter phone is: ");
            String phone = sc.nextLine();
            flag = false;
            String email;
            do{
                final String REGEX_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                              + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                System.out.println("Enter email is: ");
                email = sc.nextLine();
                Pattern pattern = Pattern.compile(REGEX_EMAIL);
                Matcher matcher = pattern.matcher(email);
                flag = matcher.matches();

                if(!flag) System.out.println("Error! ");;
            }while(!flag);
            System.out.println("Enter typeCustomer: ");
            String typeCustomer = sc.nextLine();
            System.out.println("Enter address is: ");
            String address = sc.nextLine();
            System.out.println("Enter useService is: ");
            String useService = sc.nextLine();

            Customer customer = new Customer( id,nameCustomer, birthDay, gender, cmnd, phone, email, typeCustomer, address, useService);

            String[] array = customer.showInfor().split(",");

            FileWriter villaWriter = new FileWriter(CUSTOMER_CSV, true);

            for (int i = 0; i < array.length; i++) {
                villaWriter.append(array[i]);
                if (i != array.length - 1) villaWriter.append(",");
                else villaWriter.append('\n');
            }



        }

    }


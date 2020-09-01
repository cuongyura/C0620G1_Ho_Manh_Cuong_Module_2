package Castudymd2._FuramaResort.Controllers;

import Castudymd2._FuramaResort.Commons.Add;
import Castudymd2._FuramaResort.Commons.Booking;
import Castudymd2._FuramaResort.Views.Find;
import Castudymd2._FuramaResort.Views.Show;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        try {
            displayMainMenu();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void displayMainMenu() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int menuChoise;
        do {
            System.out.println("1. Add New Services" + "\n" +
                    "2. Show Services" + "\n" +
                    "3. Add New Customers" + "\n" +
                    "4. Show Information of Customer" + "\n" +
                    "5. Add New Booking" + "\n" +
                    "6. Show Information of Employee" + "\n" +
                    "7. Buy ticket" + "\n" +
                    "8. Find Employee" + "\n" +
                    "9. Exit");
            menuChoise = sc.nextInt();
            switch (menuChoise) {
                case 1:
                    Add.addNewServices();
                    displayMainMenu();
                   break;
                   case 2:
                    Show.showServices();
                    break;
                case 3:
                    Add.addNewCustomer();
                    displayMainMenu();
                    break;
                case 4:
                    Show.showInfoCustomerInOrder();
                    displayMainMenu();
                    break;
                case 5:
                    Add.addNewBooking();
                    displayMainMenu();
                    break;
                case 6:
                    Show.showEmployees();
                    displayMainMenu();
                case 7:
                    Booking.buyTicket();
                    displayMainMenu();
                case 8:
                    Find.findEmployee();
                    displayMainMenu();
                case 9:
                    return;
            }
        } while (menuChoise < 1 || menuChoise > 7);
    }

}

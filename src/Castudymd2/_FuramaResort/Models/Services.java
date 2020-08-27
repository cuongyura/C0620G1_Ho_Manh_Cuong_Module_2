package Castudymd2._FuramaResort.Models;

import java.util.Scanner;

public abstract class Services {
    Scanner sc = new Scanner(System.in);
    // properties:

       private String id;
       private String nameService;
       private double areaUse;
       private double costOfUse;
       private int maximumNumber;
       private String rentalType;

     // constructor:

        public Services() {

        }

        public Services(String id, String nameService, double areaUse, double costOfUse, int maximumNumber, String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.costOfUse = costOfUse;
        this.maximumNumber = maximumNumber;
        this.rentalType = rentalType;
        }

        // geter and setter:


            public String getId() {
                return id;
             }

            public void setId(String id) {
                this.id = id;
             }

            public String getNameService() {
                return nameService;
             }

             public void setNameService(String nameService) {
                this.nameService = nameService;
            }

             public double getAreaUse() {
                return areaUse;
             }

             public void setAreaUse(double areaUse) {
                this.areaUse = areaUse;
             }

             public double getCostOfUse() {
                return costOfUse;
             }

            public void setCostOfUse(double costOfUse) {
                this.costOfUse = costOfUse;
            }

            public int getMaximumNumber() {
                return maximumNumber;
            }

            public void setMaximumNumber(int maximumNumber) {
                this.maximumNumber = maximumNumber;
            }

            public String getRentalType() {
                return rentalType;
            }

            public void setRentalType(String rentalType) {
                this.rentalType = rentalType;
            }

            public abstract String showInFor();


}

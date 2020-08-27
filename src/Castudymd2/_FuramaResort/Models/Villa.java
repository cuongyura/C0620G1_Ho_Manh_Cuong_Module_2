package Castudymd2._FuramaResort.Models;

import java.util.Scanner;

public class Villa extends Services{
    Scanner sc = new Scanner(System.in);
    // properties:

        private String standardRoom;
        private String descriptionConvenient;
        private double areaPool;
        private int numberFlool;

    // constructor:

    public Villa() {

    }

    public Villa(String standardRoom, String descriptionConvenient, double areaPool, int numberFlool) {
        this.standardRoom = standardRoom;
        this.descriptionConvenient = descriptionConvenient;
        this.areaPool = areaPool;
        this.numberFlool = numberFlool;
    }

    public Villa(String id, String nameService, double areaUse, double costOfUse, int maximumNumber, String rentalType, String standardRoom, String descriptionConvenient, double areaPool, int numberFlool) {
        super(id, nameService, areaUse, costOfUse, maximumNumber, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionConvenient = descriptionConvenient;
        this.areaPool = areaPool;
        this.numberFlool = numberFlool;
    }

    // getter , seter:

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionConvenient() {
        return descriptionConvenient;
    }

    public void setDescriptionConvenient(String descriptionConvenient) {
        this.descriptionConvenient = descriptionConvenient;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFlool() {
        return numberFlool;
    }

    public void setNumberFlool(int numberFlool) {
        this.numberFlool = numberFlool;
    }


    @Override
    public String showInFor() {
        return
                         "-> id is: " + getId()
                        +"-> nameService is:  " + getNameService()
                        +"-> costOfUse is:  " + getCostOfUse()
                        +"-> maximumNumber is: " + getMaximumNumber()
                        +"-> rentalType is: " + getRentalType()
                        +"-> standardRoom is:" + standardRoom
                        +"-> descriptionConvenient is: " + descriptionConvenient
                        +"-> areaPool is: " + areaPool
                        +"-> numberFlool is: " + numberFlool;

    }

}

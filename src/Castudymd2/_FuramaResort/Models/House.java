package Castudymd2._FuramaResort.Models;

public class House extends Services {
     // properties:

        private String standardRoom;
        private String descriptionConvenient;
        private int numberFlool;

     // constructor:


    public House() {

    }

    public House(String standardRoom, String descriptionConvenient, int numberFlool) {
        this.standardRoom = standardRoom;
        this.descriptionConvenient = descriptionConvenient;
        this.numberFlool = numberFlool;
    }

    public House(String id, String nameService, double areaUse, double costOfUse, int maximumNumber, String rentalType, String standardRoom, String descriptionConvenient, int numberFlool) {
        super(id, nameService, areaUse, costOfUse, maximumNumber, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionConvenient = descriptionConvenient;
        this.numberFlool = numberFlool;
    }

    // get,set:


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
                +"->standardRoom is: " + standardRoom
                +"->description Convenient is: " + descriptionConvenient
                +"->numberFlool is: " + numberFlool;
    }



}

package Castudymd2._FuramaResort.Models;

public class Room extends Services {
    // properties:

    private String servicesFree;
    // constructor:

    public Room() {

    }

    public Room(String servicesFree) {
        this.servicesFree = servicesFree;
    }

    public Room(String id, String nameService, double areaUse, double costOfUse, int maximumNumber, String rentalType, String servicesFree) {
        super(id, nameService, areaUse, costOfUse, maximumNumber, rentalType);
        this.servicesFree = servicesFree;
    }

    // get,set:


    public String getServicesFree() {
        return servicesFree;
    }

    public void setServicesFree(String servicesFree) {
        this.servicesFree = servicesFree;
    }

    @Override
    public String showInFor() {
        return
                "-> id is: " + getId()
                +"-> nameService is:  " + getNameService()
                +"-> costOfUse is:  " + getCostOfUse()
                +"-> maximumNumber is: " + getMaximumNumber()
                +"-> rentalType is: " + getRentalType()
                +"servicesFree is: " + servicesFree;

    }


}

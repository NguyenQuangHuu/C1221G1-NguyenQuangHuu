package models.facility;

import models.enums.RentType;

public class House extends Facility{
    private String serviceId;
    private String sortOfRoom;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceName, double usableArea, double rentExpense, int maximumCapacity, RentType rentType,String serviceId, String sortOfRoom, int numberOfFloors) {
        super(serviceName, usableArea, rentExpense, maximumCapacity, rentType);
        this.serviceId = serviceId;
        this.sortOfRoom = sortOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String sortOfRoom, int numberOfFloors) {
        this.sortOfRoom = sortOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getSortOfRoom() {
        return sortOfRoom;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setSortOfRoom(String sortOfRoom) {
        this.sortOfRoom = sortOfRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "sortOfRoom='" + sortOfRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

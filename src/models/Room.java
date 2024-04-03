package models;

public class Room {
    private long roomNumber;
    private String status;
    private long bedroomNumber;
    private long bathroomNumber;

    private long price;

    public Room(long roomNumber, String status, long bedroomNumber, long bathroomNumber, long price) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.bedroomNumber = bedroomNumber;
        this.bathroomNumber = bathroomNumber;
        this.price = price;
    }

    public Room() {

    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getBedroomNumber() {
        return bedroomNumber;
    }

    public void setBedroomNumber(long bedroomNumber) {
        this.bedroomNumber = bedroomNumber;
    }

    public long getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(long bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}

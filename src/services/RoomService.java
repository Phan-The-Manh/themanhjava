package services;

import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService implements Management<Room>{
    static List<Room> roomList = new ArrayList<>();

    static {
        initRoom();
    }
    public static Room initRoom(){
        Room room = new Room();
        room.setRoomNumber(roomList.size() + 1);
        room.setStatus("Phòng trống");
        room.setBedroomNumber(2);
        room.setBathroomNumber(2);
        room.setPrice(100000);
        return room;
    }
    @Override
    public Room findByID(long iD) {
        for (int i =0; i < roomList.size(); i++){
            if (roomList.get(i).getRoomNumber() == iD) return roomList.get(i);
        }
        return null;
    }

    @Override
    public void printList() {
        System.out.println(roomList);
    }

    @Override
    public void updateByID(long iD, Room room) {
        for (int i = 0; i< roomList.size(); i++){
            if (roomList.get(i).getRoomNumber() == iD) {
                roomList.get(i).setPrice(initRoom().getPrice());
            }
        }

    }

    @Override
    public void add(Room room) {
        room.setRoomNumber(roomList.size()+1);
        roomList.add(room);

    }

    @Override
    public void delete(long id) {
        for(int i = 0; i< roomList.size(); i++){
            if (roomList.get(i).getRoomNumber() == id) {
                roomList.remove(roomList.get(i));
            }
        }

    }

    public static void main(String[] args) {
        RoomService roomService = new RoomService();
        //Cach 1: them vao roomList
        Room room = new Room(1, "Occupied", 2, 2 ,1000);
        roomService.add(room);
        //Cach 2: them vao roomList
        roomService.add(new Room(2, "Available", 2, 1, 1200));
        roomService.printList();
    }
}

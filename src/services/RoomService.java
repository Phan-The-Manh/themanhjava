package services;

import models.Room;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class RoomService implements Management<Room>{
    static List<Room> roomList = new ArrayList<>();

    static {
        initRoom();
    }


    public static Room initRoom(){
        Room room = new Room(1, "Available", 2, 2, 1000);
        Room room1 = new Room(2, "Occupied", 3, 2, 2000);
        Room room2 = new Room(3, "Available", 4, 2, 3000);
        Room room4 = new Room(4, "Available", 1, 1, 1000);
        Room room5 = new Room(2, "Occupied", 1, 1, 2000);
        Room room6 = new Room(3, "Available", 1, 2, 3000);
        Room room7 = new Room(1, "Available", 2, 1, 1000);
        Room room8 = new Room(2, "Occupied", 2, 3, 2000);
        Room room9 = new Room(3, "Available", 3, 2, 3000);
        
        roomList.add(room);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room6);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        return room;

    }
    public static Room room;
    @Override
    public Room findByID(long iD) {
        for (int i =0; i < roomList.size(); i++){
            if (roomList.get(i).getRoomNumber() == iD) return roomList.get(i);
        }
        return null;
    }

    @Override
    public void printList() {
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i));
        }
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
       roomService.add(new Room(roomList.size()+1, "Occupied", 3, 3, 2000));
        roomService.printList();
    }

    public static boolean checkRoomInformation(int numberOfBedRoom, int numberOfBathRoom ){
        RoomService roomService = new RoomService();
        roomService.add( new Room(1, "Available", 2, 2, 1000));
        roomService.add( new Room(2, "Occupied", 3, 2, 2000));
        roomService.add( new Room(3, "Available", 4, 2, 3000));
        roomService.add( new Room(4, "Available", 1, 1, 1000));
        roomService.add( new Room(2, "Occupied", 1, 1, 2000));
        roomService.add( new Room(3, "Available", 1, 2, 3000));
        roomService.add( new Room(1, "Available", 2, 1, 1000));
        roomService.add( new Room(2, "Occupied", 2, 3, 2000));
        roomService.add( new Room(3, "Available", 3, 2, 3000));
        for (int i =0; i<roomList.size(); i++){
            if((roomList.get(i).getBedroomNumber() == numberOfBedRoom) && (roomList.get(i).getBathroomNumber() == numberOfBathRoom)) {
                room = roomList.get(i);
                return true;
            }
        }
        return false;
    }
}


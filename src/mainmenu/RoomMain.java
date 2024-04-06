package mainmenu;

import models.Room;
import services.RoomService;
import services.UserService;

import java.util.Scanner;

public class RoomMain {
    private static RoomService roomService = new RoomService();
    public static Scanner scanner = new Scanner(System.in);

    public static int numberOfRoom() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int sonhapvao = scanner.nextInt();
            if (sonhapvao > 0 && sonhapvao < 10) {
                return sonhapvao;
            }
        }
    }
    public static void addNewRoom() {
        int numberOfBedRoom = 0;
        int numberOfBathRoom = 0;
        while (true) {
            try {
                System.out.println("So phong ngu: ");
                numberOfBedRoom = numberOfRoom();
                break;
            } catch (Exception e) {
                System.out.println("Ban phai nhap dung so");
                UserMain.choiceService();
                UserMain.choiceManagement();
            }
        }
        while (true) {
            try {
                System.out.println("So phong tam: ");
                numberOfBathRoom = numberOfRoom();
                break;
            } catch (Exception e) {
                System.out.println("Ban phai nhap dung so");
                UserMain.choiceService();
                UserMain.choiceManagement();
            }
        }
        Room room = new Room(1, "Available", numberOfBedRoom, numberOfBathRoom, 100000);
        roomService.add(room);
        roomService.printList();
        UserMain.choiceService();
        UserMain.choiceManagement();

    }
}
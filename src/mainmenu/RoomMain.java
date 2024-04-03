package mainmenu;

import models.Room;
import services.RoomService;

import java.util.Scanner;

public class RoomMain {
    private static RoomService service = new RoomService();
    public static Scanner scanner = new Scanner(System.in);

    public void addNewRoom(){
        while(true) {
            try {
                System.out.println("Nhập số phòng ngủ:");
                int numberofbedroom = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Bạn nhập sai!");
                int numberofbedroom = scanner.nextInt();
            }
        }
        while (true) {
            try {
                System.out.println("Nhập số phòng tắm: ");
                int numberofbathroom = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Bạn nhập sai! ");
                int numberofbathroom = scanner.nextInt();
            }
        }
        while (true) {
            try {
                System.out.println("Nhập giá phòng: ");
                int price = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Bạn nhập sai!");
                int numberofbathroom = scanner.nextInt();
            }
        }


        Room room = new Room(1, "Available", 2, 2, 100000);
    }
}

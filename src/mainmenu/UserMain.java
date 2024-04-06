package mainmenu;

import models.User;
import services.UserService;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class UserMain {
    private static UserService userService = new UserService();
    public static Scanner scanner = new Scanner(System.in);
    public static void login() {
        while (true) {
            System.out.println(("Tên đăng nhập: "));
            String username = scanner.nextLine();
            System.out.println("Mật khẩu: ");
            String password = scanner.nextLine();
            boolean check = userService.checkLogin(username, password);
            if (check) {
                System.out.println("Đăng ký  thành công");
                System.out.println("Xin chào: " + UserService.user.getUserName());
                try {
                    choiceService();
                    choiceManagement();
                    break;
                } catch (Exception e) {
                    choiceService();
                    choiceManagement();
                }
            }
                else System.out.println("Tên đăng nhập hoặc mk không đúng");

        }
    }

public static void choiceService(){
    System.out.println("Mời chọn");
    System.out.println("1:Làm quản lý");
    System.out.println("2:Làm khách hàng");
    System.out.println("3:Đăng nhập");
    System.out.println("4:Đăng ký");
}

    public static void choiceManagement() {
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        switch (choice) {
            case 1: {
                RoomMain.addNewRoom();
                break;
            }
            case 2:{
                break;
            }
            case 3: {
                UserMain.login();
            }
            case 4: {
                UserMain.register();
                break;
            }
            case 0: {
               System.exit(0);
            }
            default: {
                System.out.println("Không có lựa chọn này");
            }
        }
    }


        public static void register(){
            Scanner scaner = new Scanner(System.in);
            System.out.println("Tên đăng nhập: ");
            String username = scanner.nextLine();
            System.out.println("Mat khau: ");
            String password = scanner.nextLine();
            User user = new User(username, password);
            userService.add(user);
            userService.printList();
        }
    }
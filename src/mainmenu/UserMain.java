package mainmenu;

import services.UserService;

import java.util.Scanner;

public class UserMain {
    private static UserService UserService = new UserService();
    public static Scanner scanner = new Scanner(System.in);
    public static void login(){
        while (true){
            System.out.println(("Tên đăng nhập: "));
            String username = scanner.nextLine();
            System.out.println("Mật khẩu: ");
            String password = scanner.nextLine();
            boolean check = userService.checkLogin(username, password);
            if (check){
                System.out.println("Đăng nhập thành công");
                System.out.println("Xin chào: "+ username);
                System.out.println("");
                break;
            }
            else System.out.println("Tên đăng nhập hoặc mật khẩu không đúng");
        }
    }
    public static void register() {
        System.out.println("Tên đăng nhập: ");
    }

    public static void exit(int i) {
    }
}

package CaseModule2.view;

import CaseModule2.controller.ControllerAccount;

import java.util.Scanner;

public class MenuMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        mainMenu();
    }

    public static void mainMenu() throws Exception {
        while (true) {
            System.out.printf("%35s \n","/-----CHƯƠNG TRÌNH QUẢN LÝ NỮ NHÂN VIÊN CỦA ÔNG BẦU TUẤN -----\\");
            System.out.println("|  1.Đăng nhập                                                |");
            System.out.println("|  2.Đăng kí                                                  |");
            System.out.println("|  3.Hiển thị danh sách tài khoản                             |");
            System.out.println("|  4.Xóa tài khoản                                            |");
            System.out.println("|  5.Đổi mật khẩu                                             |");
            System.out.println("|  6.Exit                                                     |");
            System.out.println("|_____________________________________________________________|");
            System.out.print("|  Nhập số để chọn chức năng :");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.err.println("Nhập phải là số!");
            }
            switch (choice) {
                case 1 :
                    ControllerAccount.logIn();
                    break;
                case 2 :
                    ControllerAccount.createAccount();
                    break;
                case 3 :
                    ControllerAccount.showAccount();
                    break;
                case 4 :
                    ControllerAccount.deleteAccount();
                    break;
                case 5 :
                    ControllerAccount.fixPassword();
                    break;
                case 6 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Nhập lại!");
                    mainMenu();
            }
        }
    }
}

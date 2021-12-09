package CaseModule2.view;
import CaseModule2.controller.ControllerStaff;

import java.util.Scanner;

public class MenuUser {
    static Scanner sc = new Scanner(System.in);
    static ControllerStaff controllerStaff = new ControllerStaff();
    public static void Menu() throws Exception {
        while (true) {
            System.err.println("    Bạn đã đăng nhập bằng tài khoản User");
            System.out.println("//=========~~~~~>  UserMenu  <~~~~~==========\\");
            System.out.println("|    1. Tìm kiếm nhân viên.                  |");
            System.out.println("|    2. Kiểm tra trạng thái nhân viên.       |");
            System.out.println("|    3. Thông tin tài khoản.                 |");
            System.out.println("|    4. Hiển thị nhân viên                   |");
            System.out.println("|    5. Sắp xếp theo tên nv                  |");
            System.out.println("|    6. Hiển thị nhân viên theo trạng thái   |");
            System.out.println("|    7. Đăng xuất                            |");
            System.out.println("|____________________________________________|");
            System.out.print("|    Nhập số để chọn chức năng :");
            int choice =0;
            try{
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.err.println("Nhập số!");
            }
            switch (choice) {
                case 1 :
                    controllerStaff.showStaff();
                    break;
                case 2 :
                    controllerStaff.checkStatusStaff();
                    break;
                case 3 :
                    controllerStaff.hTHiTK();
                    break;
                case 4 :
                    controllerStaff.showListStaff();
                    break;
                case 5 :
                    controllerStaff.sortByName();
                    break;
                case 6 :
                    controllerStaff.showNvTheoTT();
                    break;
                case 7 :
                    controllerStaff.logOut();
                    break;
                default :
                    System.out.println("Nhập lại!");
            }
        }
    }
}

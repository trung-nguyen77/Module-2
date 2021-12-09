package CaseModule2.view;
import CaseModule2.controller.ControllerStaff;

import java.util.Scanner;

public class MenuAdmin {
    static Scanner sc = new Scanner(System.in);
    static ControllerStaff controllerStaff = new ControllerStaff();
    public static void AdminMenu() throws Exception {
        while (true) {
            System.err.println("    Bạn đã đăng nhập bằng tài khoản Admin");
            System.out.println("//~~~~~~~~~~ MenuAdmin ~~~~~~~~~~\\");
            System.out.println("|  1.  Create Staff:             |");
            System.out.println("|  2.  Search Staff:             |");
            System.out.println("|  3.  Status Checking Staff:    |");
            System.out.println("|  4.  Update Staff:             |");
            System.out.println("|  5.  Status Update Staff:      |");
            System.out.println("|  6.  Account Information:      |");
            System.out.println("|  7.  Delete Staff:             |");
            System.out.println("|  8.  Show Staff:               |");
            System.out.println("|  9.  Staff Sort By Name:       |");
            System.out.println("|  10. Show Staff Status:        |");
            System.out.println("|  11. Sign Out!                 |");
            System.out.println("|________________________________|");
            System.out.print("|  Nhập số để chọn chức năng :");
            int choice =0;
            try{
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.err.println(" Enter Number!");
            }
            switch (choice) {
                case 1 :
                    controllerStaff.createStaff();
                    break;
                case 2 :
                    controllerStaff.showStaff();
                    break;
                case 3 :
                    controllerStaff.checkStatusStaff();
                    break;
                case 4 :
                    controllerStaff.updateStaff();
                    break;
                case 5 :
                    controllerStaff.updateStatus();
                    break;
                case 6 :
                    controllerStaff.hTHiTK();
                    break;
                case 7 :
                    controllerStaff.xoa();
                    break;
                case 8 :
                    controllerStaff.showListStaff();
                    break;
                case 9 :
                    controllerStaff.sortByName();
                    break;
                case 10 :
                    controllerStaff.showNvTheoTT();
                    break;
                case 11 :
                    controllerStaff.logOut();
                    break;
                default :
                    System.out.println("Nhập lại!");
            }
        }
    }

}

package CaseModule2.controller;

import CaseModule2.model.Account;
import CaseModule2.view.MenuAdmin;
import CaseModule2.view.MenuUser;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerAccount {
    static MenuAdmin menuAdmin = new MenuAdmin();
    static MenuUser menuUser = new MenuUser();
    static Scanner scanner = new Scanner(System.in);
    static File fileAdminAccount = new File("AdminAccount.txt");
    static File fileUserAccount = new File("UserAccount.txt");
    static ArrayList<Account> listAccount1 = new ArrayList<>();
    static ArrayList<Account> listAllAccount = new ArrayList<>();

    public static String getTK() {
        while (true) {
            try {
                System.out.println("Nhập tên đăng nhập:");
                String account = scanner.nextLine();
                for (Account acc : listAllAccount){
                    if (acc.getUserName().equals(account)){
                        throw new Error();
                    }
                }
                if (account.equals("")) {
                    throw new Error();
                }
                return account;
            } catch (Error error) {
                System.err.println("Không được để trống hoặc bị trùng!");
            }
        }
    }

    public static String getMK() {
        while(true){
            try {
                System.out.println("Nhập mật khẩu:");
                String mk = scanner.nextLine();
                if (mk.equals("")) {
                    throw new Error();
                }
                return mk;
            } catch (Error e) {
                System.err.println("Không được để trống!");
            }
        }
    }

    public static String getRole(){
        while (true) {
            try {
                System.out.println("Nhập role");
                String role = scanner.nextLine();
                if(role.equals("user")||role.equals("admin")){
                    return role;
                }else throw new InterruptedException();

            }catch (InterruptedException e){
                System.err.println("Sai định dạng !!!!");
                System.err.println("Nhập \"user\" hoặc \"admin\"!");
            }
            catch (Exception e){
                System.err.println("Sai định dạng !!!");
            }
        }
    }


    public static void logIn() throws Exception {
        try {
            System.out.println("Nhập tên đăng nhập");
            String userName = scanner.nextLine();
            System.out.println("Nhập mật khẩu");
            String passWord = scanner.nextLine();
            boolean check = true;
            listAllAccount = readAdminAccount();
            for (Account account : listAllAccount) {
                if (account.getUserName().equals(userName) && account.getPassWord().equals(passWord)){
                    check = false;
                    if (account.getRole().equalsIgnoreCase("admin")) {
                        listAccount1.add(new Account(userName, passWord, account.getRole()));
                        writeUserAccount(listAccount1);
                        menuAdmin.AdminMenu();
                    } else {
                        listAccount1.add(new Account(userName, passWord, account.getRole()));
                        writeUserAccount(listAccount1);
                        menuUser.Menu();
                    }
                    break;
                }
            }
            if (check){
                throw  new Error();
            }
        } catch (Error e) {
            System.err.println("Sai đăng nhập!");
        }
    }

    public static void logOut(){
        listAccount1.remove(0);
    }

    public static void fixPassword(){
        listAllAccount = readAdminAccount();
        System.out.println("Nhâp tên tài khoản");
        String nameAccount = scanner.nextLine();
        System.out.println("Nhập mật khẩu hiện tại");
        String mk = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i< listAllAccount.size(); i++){
            if (listAllAccount.get(i).getUserName().equals(nameAccount) && listAllAccount.get(i).getPassWord().equals(mk)){
                System.out.println("Nhập mật khẩu mới");
                String newPassword = scanner.nextLine();
                listAllAccount.set(i,new Account(nameAccount, newPassword, listAllAccount.get(i).getRole()));
                System.out.println("Thay đổi mật khẩu thành công!");
                writeAdminAccount(listAllAccount);
                check = false;
            }
        }
        if (check) System.err.println("Thông tin tài khoản không đúng!");
    }
    static public void showAccount(){
        try {
            listAllAccount = readAdminAccount();
            for (Account t : listAllAccount){
                System.out.println( "tài khoản: " +t.getUserName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public  void showUserAccount() {
        listAccount1 = readUserAccount();
        for (Account t : listAccount1){
            System.out.println("tài khoản đang đăng nhập là: " +t.getUserName());
        }
    }

    public static void createAccount() {
        listAllAccount.add( new Account(getTK(),getMK(), getRole()));
        System.out.println("đăng kí tài khoản thành công!");
        writeAdminAccount(listAllAccount);
    }

    public static void deleteAccount(){
        System.out.println("nhập tên tài khoản:");
        String nameTk = scanner.nextLine();
        for (int i = 0; i< listAllAccount.size(); i++){
            if (listAllAccount.get(i).getUserName().equals(nameTk)){
                listAllAccount.remove(i);
            }
        }
        writeAdminAccount(listAllAccount);
    }

    public static void writeAdminAccount(ArrayList<Account> tk) {
        try {
            FileOutputStream fos = new FileOutputStream(fileAdminAccount);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tk);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Account> readAdminAccount() {
        ArrayList<Account> t = new ArrayList<>();
        try {
            if (!fileAdminAccount.exists())
                fileAdminAccount.createNewFile();
            FileInputStream fis = new FileInputStream(fileAdminAccount);
            ObjectInputStream ois = new ObjectInputStream(fis);
            t = (ArrayList<Account>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            System.err.println("Chưa có tài khoản được tạo!");
        }
        return t;
    }

    static public void writeUserAccount(ArrayList<Account> tk)  {
        try {
            FileOutputStream fos = new FileOutputStream(fileUserAccount);
            ObjectOutput oos = new ObjectOutputStream(fos);
            oos.writeObject(tk);
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Account> readUserAccount() {
        ArrayList<Account> t = new ArrayList<>();
        try {
            if (!fileUserAccount.exists())
                fileUserAccount.createNewFile();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("taiKhoanDN.txt"));
            t = (ArrayList<Account>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("File trống!");
        }
        return t;
    }
}

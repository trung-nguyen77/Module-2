package CaseModule2.controller;
import CaseModule2.view.MenuMain;
import CaseModule2.model.FullTimeStaff;
import CaseModule2.model.PartTimeStaff;
import CaseModule2.model.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerStaff {
    static Scanner sc =  new Scanner(System.in);
    static File nhanVien = new File("nhanVien.txt");
    static ArrayList<Staff> list = new ArrayList<>();

    public void createStaff() throws IOException {
        System.out.println("1.thêm nhân viên fulltime");
        System.out.println("2.thêm nhân viên parttime");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            Staff nv = createStaff("full");
            list.add(nv);
        } else {
            Staff nv = createStaff("part");
            list.add(nv);
        }
        ghiFile();
    }

    public void showStaff(){
        list = docFile();
        System.out.println("nhập tên cần tìm kiếm thông tin");
        String name = sc.nextLine();
        boolean check = false;
        for (Staff nv : list){
            if(nv.getName().contains(name)){
                System.out.println(nv);
            }else if(!(nv.getName().equals(name))){
                check = true;
            }
        }
        if (check){
            System.err.println("Không tìm thấy nhân viên " + name);
        }
    }

    public void xoa() throws IOException {
        list = docFile();
        System.out.println("nhập mã nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        for (int i =0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                list.remove(i);
            }
        }
        ghiFile();
    }

    public void updateStaff() throws IOException {
        list = docFile();
        System.out.println("nhập id của nhân viên cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                if (list.get(i) instanceof FullTimeStaff){
                    list.set(i, createStaff("full"));
                }else list.set(i, createStaff("part"));
            }
        }
        ghiFile();
    }

    public void checkStatusStaff(){
        list = docFile();
        System.out.println("nhập tên nhân viên muốn kiểm tra trạng thái");
        String name = sc.nextLine();
        for (Staff nv : list){
            if (nv.getName().equals(name)){
                System.out.println("trạng thái: "+ nv.getStatus());
            }
        }
    }

    public void updateStatus() throws IOException {
        System.out.println("nhập tên nhân viên muốn thay đổi trạng thái");
        String name = sc.nextLine();
        for (Staff nv : list){
            if (nv.getName().equals(name)){
                nv.setStatus(getStatus());
                System.out.println(nv);
            }
        }
        ghiFile();
    }

    public void showNvTheoTT() throws IOException {
        list = docFile();
        System.out.println("1.true");
        System.out.println("2.false");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice ==1){
            for (int i =0; i<list.size(); i++) {
                if (list.get(i).getStatus().equals("true")) {
                    System.out.println(list.get(i));
                }
            }
        }
        if (choice==2){
            for (int i =0; i<list.size(); i++) {
                if (list.get(i).getStatus().equals("false")) {
                    System.out.println(list.get(i));
                }
            }
        }
        ghiFile();
    }

    public void sortByName() throws IOException {
        SortByName sortByName = new SortByName();
        list.sort(sortByName);
        ghiFile();
    }

    public void  hTHiTK() throws Exception {
        ControllerAccount.showUserAccount();
    }

    public void showListStaff(){
        list = docFile();
        for (Staff nv : list) {
            System.out.println(nv);
        }
    }

    public int getId() {
        while (true) {
            try {
                System.out.println("nhập id");
                int id = Integer.parseInt(sc.nextLine());
                list = docFile();
                for (Staff nv : list) {
                    if (nv.getId() == id) {
                        throw new Error();
                    }
                }
                return id;
            } catch (Error e) {
                System.err.println("id đã tồn tại!");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        while (true) {
            boolean flag;
            do {
                System.out.println("nhập tên");
                String name = sc.nextLine();
                flag = SdtEmailRegex.validateName(name);
                if (flag) {
                    return name;
                } else System.err.println("Tên không hợp lệ!");
            } while (!flag);
        }
    }

    public String getSDT() {
        while (true) {
            boolean flag;
            do {
                System.out.println("nhập số điện thoại(0XXXXXXXXX)");
                String sdt = sc.nextLine();
                flag = SdtEmailRegex.validateSDT(sdt);
                if (flag){
                    return sdt;
                } else System.out.println("số điện thoại chưa hợp lệ");
            } while (!flag);
        }
    }

    public String getDiaChi(){
        System.out.println("nhập địa chỉ");
        return sc.nextLine();
    }

    public String getStatus(){
        while (true){
            try {
                System.out.println("nhập trạng thái");
                String trangThai = sc.nextLine();
                if (trangThai.equals("true")||trangThai.equals("false")){
                    return trangThai;
                } else throw new Error();
            }
            catch (Error e){
                System.err.println("Nhập trạng thái là \"true\" hoặc \"false\"");
            }
        }
    }

    public double getTime(){
        System.out.println("nhập số giờ");
        return Double.parseDouble(sc.nextLine());
    }

    public String getEmail() {
        while (true) {
            try {
                boolean flag;
                do {
                    System.out.println("nhập email");
                    String email = sc.nextLine();
                    flag = SdtEmailRegex.validateEmail(email);
                    if (flag) {
                        list = docFile();
                        for (Staff nv : list) {
                            if (nv.getEmail().equals(email)) {
                                throw new Error();
                            }
                        }
                        return email;
                    } else System.err.println("email chưa hợp lệ!");
                } while (!flag);
            } catch (Error e) {
                System.err.println(" email đã được sử dụng!");
            }
        }
    }

    public String gioiTinh(){
        while (true){
            try {
                System.out.println("nhập giới tính:");
                String gender = sc.nextLine();
                if (gender.equals("male")||gender.equals("female")){
                    return gender;
                } else throw new Error();

            }
            catch (Error e){
                System.err.println("Giới tính phải là \"male\" hoặc \"female\"");
            }
        }
    }

    public int age(){
        while (true) {
            try {
                System.out.println("nhập tuổi");
                int age = Integer.parseInt(sc.nextLine());
                if (age < 18) {
                    throw new Error();
                } else {
                    return age;
                }
            } catch (Error e) {
                System.err.println("Chưa đủ tuổi lao động!");
            } catch (Exception e) {
                System.err.println("tuổi phải là số!");
            }
        }
    }

    public double luong(){
        while (true){
            try {
                System.out.println("nhập lương");
                return Double.parseDouble(sc.nextLine());
            }
            catch (Exception e){
                System.err.println("lương phải là số!");
            }
        }
    }

    public static  void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(nhanVien);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Staff nv : list){
                bufferedWriter.write(nv.ghi());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }

    public static ArrayList<Staff> docFile()  {
        ArrayList<Staff> list1 = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(nhanVien);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 9) {
                    list1.add(new Staff(str[0].trim(), Integer.parseInt(str[1].trim()), Integer.parseInt(str[2].trim()), str[3].trim(), str[4].trim(), str[5].trim(),str[6].trim(), Double.parseDouble(str[7].trim()),str[8].trim()));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
        }
        return  list1;
    }

    public Staff createStaff(String kieuNv){
        if (kieuNv.equals("full time")) {
            return new FullTimeStaff(getName(), getId(), age(), getSDT(), gioiTinh(), getEmail(), getDiaChi(), luong(), getStatus() );
        } else {
            return new PartTimeStaff(getName(), getId(), age(), getSDT(), gioiTinh(), getEmail(), getDiaChi(), luong(), getStatus(), getTime());
        }
    }

    public void logOut() throws Exception {
        ControllerAccount.logOut();
        MenuMain.mainMenu();
    }
}

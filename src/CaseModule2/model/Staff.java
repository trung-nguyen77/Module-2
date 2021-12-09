package CaseModule2.model;
import java.io.Serializable;

public class Staff implements Serializable {
    private String name;
    private int age;
    private String phoneNumber;
    private String gender;
    private String email;
    private String address;
    private double salary;
    private String status;
    private int id;

    public Staff() {
    }

    public Staff(String name, int id, int age, String phoneNumber, String gender, String email, String address, double salary, String status) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.status = status;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double income(){
        return getSalary();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sdt='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + address + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }

    public  String ghi(){
        return name + ", " + id +", " + age + ", " + phoneNumber + ", " + gender + ", " + email + ", " + address + ", " + salary + ", " + status;
    }
}

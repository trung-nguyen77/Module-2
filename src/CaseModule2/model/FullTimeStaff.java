package CaseModule2.model;

public class FullTimeStaff extends Staff {
    public FullTimeStaff() {
    }

    public FullTimeStaff(String name, int id, int age, String phoneNumber, String gender, String email, String address, double salary, String status) {
        super(name, id, age, phoneNumber, gender, email, address, salary, status);
    }

    @Override
    public double income(){
        return super.getSalary()*8;
    }
}

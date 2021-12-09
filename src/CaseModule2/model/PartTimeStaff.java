package CaseModule2.model;

public class PartTimeStaff extends Staff {
    private double time;

    public PartTimeStaff() {
    }

    public PartTimeStaff(String name, int id, int age, String sdt, String gender, String email, String diaChi, double luong, String trangThai, double time) {
        super(name, id, age, sdt, gender, email, diaChi, luong, trangThai);
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public double income(){
        return getSalary()*time;
    }
}

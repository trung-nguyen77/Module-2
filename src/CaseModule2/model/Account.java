package CaseModule2.model;
import java.io.Serializable;

public class Account implements Serializable{
    private String userName;
    private String passWord;
    private String role;

    public Account() {
    }

    public Account(String userName, String passWord, String role) {
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String writeAccount(){
        return userName + "," + passWord + "," + role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "tk='" + userName + '\'' +
                ", mk='" + passWord + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

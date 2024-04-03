package models;

public class User {
    private long iD;
    private String userName;
    private String passWord;
    private String Role;

    public User() {
    }

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
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

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
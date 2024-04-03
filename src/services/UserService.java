package services;

import models.User;

import java.util.ArrayList;

public class UserService implements Management<User> {
    private static ArrayList<User> userList = new ArrayList<>();
    
    static {
        initUser();
    }

    private static User initUser() {
        User user = new User();
        user.setiD(userList.size()+1);
        user.setUserName("Manh");
        user.setPassWord("12345");
        user.setRole("Admin");
        return user;
    }

    public static User user;
    
    

    @Override
    public User findByID(long iD) {
        for (int i =0; i< userList.size(); i++){
            if (userList.get(i).getiD() == iD) {
                return userList.get(i);
            }
        }

        return null;
    }

    @Override
    public void printList() {
        System.out.println(userList);

    }

    @Override
    public void updateByID(long iD, User user) {
        for (int i =0; i<userList.size(); i++){
            if (userList.get(i).getiD()==iD){
                userList.get(i).setUserName(initUser().getUserName());
            }
        }

    }

    @Override
    public void add(User user) {
        user.setiD(userList.size() + 1);
        userList.add(user);

    }

    @Override
    public void delete(long id) {
        for (int i =0; i< userList.size(); i++){
            if (userList.get(i).getiD() == id) {
                userList.remove(userList.get(i));
            }
        }

    }
    public boolean checkLogin(String username, String password){
        for (int i =0; i<userList.size(); i++){
            if(userList.get(i).getUserName().equals(username) && userList.get(i).getPassWord().equals(password)) {
                user = userList.get(i);
                return true;
            }
        }
        return false;
    }

}

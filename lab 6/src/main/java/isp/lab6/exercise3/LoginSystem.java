package isp.lab6.exercise3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    private Set<User> users =  new HashSet<User>();
    private OnlineStore store = new OnlineStore();

    public Set<User> getUsers() {
        return users;
    }

    public OnlineStore getStore() {
        return store;
    }

    public void addUser(User user){
        users.add(user);
    }
    public void register(String usermane, String password){
        User user1 = new User(usermane,password);
        users.add(user1);
    }
    public boolean login(String username, String password ){
        if(users.contains(new User(username,password)))
            return true;
        else return false;
    }

    public boolean logout(String username){
        for(User user : users) {
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "LoginSystem{" +
                "users=" + users +
                ", store=" + store +
                '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Vu
 */
public class User {
    private int userID;
    private String userName;
    private String password;
    private String name;
    private String email;
    private String avatarUrl;
    private int role;
    private int active;

    public User() {
    }

    public User(int userID, String userName, String password, String name, String email, String avatarUrl, int role, int active) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.role = role;
        this.active = active;
    }

    public int getActive() {
        return active;
    }

    
    
    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public int getRole() {
        return role;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setActive(int active) {
        this.active = active;
    }
    
    
    
}

package com.example.Cart.DTO;

public class UserDTO {


    private int userId;

    private String name;

    public UserDTO(int id, String name, String email, String phoneNumber) {
        this.userId = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private String email;
    private String phoneNumber;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}

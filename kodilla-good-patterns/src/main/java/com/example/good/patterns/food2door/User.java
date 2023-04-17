package com.example.good.patterns.food2door;

public class User {

    private String name;
    private String surname;
    private String adress;
    private String email;
    private String mobile;

    public User(String name, String surname, String adress, String email, String mobile) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

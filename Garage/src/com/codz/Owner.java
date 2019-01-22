package com.codz;

public class Owner {

    private String name;
    private String address;
    private String phoneNumber;

    public Owner(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.phoneNumber = contact;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

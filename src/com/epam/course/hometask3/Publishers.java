package com.epam.course.hometask3;

class Publishers {
    private String name;
    private int id;
    private String address;

    public Publishers(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public Publishers() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Publishers{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

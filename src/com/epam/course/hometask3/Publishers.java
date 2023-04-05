package com.epam.course.hometask3;

class Publishers extends Book {
    private String id;
    private String address;

    public Publishers(String name, String id, String address) {
        super(name);
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

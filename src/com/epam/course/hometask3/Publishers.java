package com.epam.course.hometask3;

class Publishers extends Book {
    private String address;
    public Publishers(String name, String id, String address) {
        super(name, id);
        this.address = address;
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
                "address='" + address + '\'' +
                '}';
    }
}

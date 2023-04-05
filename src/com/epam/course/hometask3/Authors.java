package com.epam.course.hometask3;

class Authors extends Book {

    public Authors(String name, String id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

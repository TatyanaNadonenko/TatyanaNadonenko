package com.epam.course.hometask3;

class Authors extends Book {

    private String id;

    public Authors(String id, String name) {
        super(name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "id='" + id + '\'' +
                '}';
    }
}

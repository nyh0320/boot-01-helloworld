package com.atguigu.boot.bean;

public class Pet {
    private String name;

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public Pet(String name) {
        this.name = name;
    }
}

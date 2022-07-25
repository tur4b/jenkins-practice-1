package com.practice.service;

public class UserService {

    public void create(Integer id, String name) {
        System.out.println("create");
    }

    public void deleteById(Integer id) {
        System.out.println("delete");
    }

    public int sum(int a, int b) {
        if(a < 0 && b < 0) {
            throw new IllegalArgumentException("Invalid parameters!");
        }

        return a + b;
    }

}

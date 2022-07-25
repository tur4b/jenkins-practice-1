package com.practice.service;

public class UserService {

    public void create(Integer id, String name) {
        System.out.println("create");
    }

    public void deleteById(Integer id) {
        System.out.println("delete");
    }

    public int sum(int a, int b) {
        return a + b;
    }

}

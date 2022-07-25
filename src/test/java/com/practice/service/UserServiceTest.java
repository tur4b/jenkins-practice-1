package com.practice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    public void create() {
        userService.create(1, "test");
    }

    @Test
    public void deleteById() {
        userService.deleteById(1);
    }

}
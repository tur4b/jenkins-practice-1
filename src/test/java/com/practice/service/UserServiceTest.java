package com.practice.service;

import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    public void sum() {

        final val sum = userService.sum(5, 4);
        Assertions.assertEquals(9, sum);
    }

    @Test
    public void sumIsNotValid() {

        final val sum = userService.sum(5, 4);
        Assertions.assertNotEquals(10, sum);
    }

    @Test()
    public void sumThrowsException() {

        final IllegalArgumentException exc = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.sum(-5, -4);
        });
        Assertions.assertEquals("Invalid params!", exc.getMessage());
    }

    @Test
    public void deleteById() {
        userService.deleteById(1);
    }

}
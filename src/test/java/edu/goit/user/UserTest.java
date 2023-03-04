package edu.goit.user;


import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @org.junit.jupiter.api.Test
    void getName() {
        User user = new User();
        user.setName("Yevgen");
        assertEquals("Yevgen",user.getName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        User user = new User();
        user.setLastName("Galamaga");
        assertEquals("Galamaga",user.getLastName());
    }
}
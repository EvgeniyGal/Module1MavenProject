package edu.goit;

import com.google.gson.Gson;
import edu.goit.user.User;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Yevgen");
        user.setLastName("Galamaga");

        Gson gson = new Gson();

        System.out.println(gson.toJson(user));

    }
}
package com.example.utils;

import jakarta.persistence.Entity;
import java.util.Random;

@Entity
public class CustomIdGenerator {

    private static final Random RANDOM = new Random();

    public static Long generateRandomId() {
        return 10000L + RANDOM.nextInt(90000);
    }
}
package com.company;

public class AgeUtil {
    public static void checkAge(int age) {
        try {
            check(age);
            System.out.println("Подходит");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check(int age) throws AgeException {
        if (age < 16 || age > 100) {

            throw new AgeException("не подходит");
        }
    }
}

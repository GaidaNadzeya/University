package com.company;

public class AgeUtil {
    public static boolean checkAge(int age) {
        try {
            check(age);
           return true;
        } catch (AgeException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void check(int age) throws AgeException {
        if (age < 16 || age > 100) {

            throw new AgeException("не подходит");
        }
    }
}

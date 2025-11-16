package me.liquor4k;

import java.time.LocalDate;

public class Main {
        //Для Задачи 1
    public static void main(String[] args) {
        checkLeapYear(2024);
        checkLeapYear(2023);
        checkLeapYear(2000);
        checkLeapYear(1900);
            }

    // Задача 1 - Проверка високосного года
    public static void checkLeapYear(int year) {
        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}

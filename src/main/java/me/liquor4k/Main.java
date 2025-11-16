package me.liquor4k;

import java.time.LocalDate;

public class Main {
        // Для Задачи 1
    public static void main(String[] args) {
        System.out.println("\n Задание 1");
        checkLeapYear(2024);
        checkLeapYear(2023);
        checkLeapYear(2000);
        checkLeapYear(1900);

        // Для Задачи 2
        System.out.println("\n Задание 2");
        suggestAppVersion(0, 2014); // iOS, старый телефон
        suggestAppVersion(1, 2023); // Android, новый телефон
        suggestAppVersion(0, 2024); // iOS, новый телефон

        // Для задачи 3
        System.out.println("\n Задание 3");
        int[] testDistances = {15, 25, 65, 95, 105};

        for (int distance : testDistances) {
            int daysRequired = calculateDeliveryDays(distance);
            if (daysRequired == -1) {
                System.out.println("При расстоянии " + distance + " км: Доставки нет");
            } else {
                System.out.println("При расстоянии " + distance + " км: Потребуется дней: " + daysRequired);
            }
        }
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
    // Задача 2 - Рекомендация версии приложения
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = "";
        String versionType = "обычную";

        if (deviceYear < currentYear) {
            versionType = "облегченную";
        }

        switch (osType) {
            case 0:
                osName = "iOS";
                break;
            case 1:
                osName = "Android";
                break;
            default:
                System.out.println("Неизвестная операционная система");
                return;
        }

        System.out.println("Установите " + versionType + " версию приложения для " + osName + " по ссылке");
    }
    // Задача 3 - Расчет дней доставки
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays += 1;
        }
        if (deliveryDistance > 60) {
            deliveryDays += 1;
        }
        if (deliveryDistance > 100) {
            deliveryDays = -1; // доставки нет
        }

        return deliveryDays;
    }
}

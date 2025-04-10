package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double percentage = percent / 100;
        double godovoi = amount + (amount * percentage);
        while (godovoi > 0) {
            if (godovoi <= salary) {
                year++;
                break;
            } else {
                godovoi -= salary;
                year++;
            }
        }
        return year;
    }
}

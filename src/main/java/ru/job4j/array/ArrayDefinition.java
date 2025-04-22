package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        int[] numbers = new int[10];
        System.out.println("Размер массива равен: " + numbers.length);
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        numbers[0] = 2006;
        numbers[1] = 2010;
        numbers[2] = 2014;
        numbers[3] = 2018;
        numbers[4] = 2022;
        int years = numbers[3];
        System.out.println(years);
        System.out.println(numbers[3]);
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Artem Chigarov";
        names[2] = "Nurlan Safarov";
        names[3] = "Sergey Kashirov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

package ru.gb.hw4;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        printArray(arr);
        System.out.println();
        System.out.println(sumAll(arr));

    }

    public static int sumAll(String[][] inputArray) {
        int sum = 0;
        for (String[] strings : inputArray) {
            for (String string : strings) {
                sum += Integer.parseInt(string);
            }
        }
        return sum;
    }

    public static void printArray(String[][] array) {
        for (String[] s : array) {
            for (String str : s) {
                System.out.printf(str + " ");
            }
            System.out.print(" ");
        }
    }
}
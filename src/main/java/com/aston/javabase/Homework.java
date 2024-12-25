package com.aston.javabase;

import com.aston.javabase.class_loaders.ClassLoaders;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework {

    public static void main(String[] args) {
        turnString("I love Java");

        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        getDistinctNumbers(ints);

        System.out.println();
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println(findSecondMaxElement(arr));

        System.out.println("Hello world - " + lengthOfLastWord("Hello world"));
        System.out.println("    fly me    to the moon    " + " - " + lengthOfLastWord("    fly me    to the moon    "));
    }

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            char s = string.charAt(i);
            System.out.print(s);
        }
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        Set<Integer> set = new HashSet<>();
        for (int number: ints) {
            set.add(number);
        }

//        Если нужно снова преобразовать в массив
        int[] newArray = new int[set.size()];
        int i = 0;
        for (int number: set) {
            newArray[i++] = number;
        }

//        Если нужно просто вывести уникальные значения
        System.out.println();
        for (int number: set) {
            System.out.print(number + " ");
        }
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > max) {
                secondMax = max;
                max = number;
            }
            else if (number > secondMax) {
                secondMax = number;
            }
        }
        return secondMax;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        String[] words = string.trim().split("\\s+");

        if (words.length > 0) {
            return words[words.length - 1].length();
        }
        else {
            return 0;
        }
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        return false;
    }
}

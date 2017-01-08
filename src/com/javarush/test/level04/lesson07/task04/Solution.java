package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);
        int count = 0;
        if (a1 > 0) count++;
        if (b1 > 0) count++;
        if (c1 > 0) count++;
        int count2 = 0;
        if (a1 < 0) count2++;
        if (b1 < 0) count2++;
        if (c1 < 0) count2++;
        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count);
    }
}

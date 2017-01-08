package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int a, b, tmp;
        int[] num = new int[5];
        for (int i = 0; i < 5; i++)
        {
            String sNum = reader.readLine();
            num[i] = Integer.parseInt(sNum);
//            System.out.println(num[i]);
        }
        for (a = 1; a < num.length; a++)
        {
            for (b = num.length - 1; b >= a; b--)
            {
                if (num[b-1]>num[b])
                {
                    tmp = num[b];
                    num[b] = num[b - 1];
                    num[b - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }


    }
}

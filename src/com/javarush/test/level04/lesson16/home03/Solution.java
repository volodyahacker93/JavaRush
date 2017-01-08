package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String a = reader.readLine();
//        int a1 = Integer.parseInt(a);
        int a1 = 0;
        int sum = 0;
        while (a1 != -1){
            String a = reader.readLine();
            a1 = Integer.parseInt(a);
            sum = sum + a1;
        }
        if (a1 == -1) {
            System.out.println(sum);
        }
    }
}

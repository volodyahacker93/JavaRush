package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double a1 = convertEurToUsd(10,102.1);
        double a2 = convertEurToUsd(11,10.1);
        System.out.println(a1);
        System.out.println(a2);
    }

    public static double convertEurToUsd(int eur, double course){
        double usd = eur * course;
        return usd;
    }
}

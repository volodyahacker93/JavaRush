package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1-adin");
        list.add("2-dwa");
        list.add("3-tre");
        list.add("4-cheturi");
        list.add("5-pat");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++)
        {
//            int j = list.size() - i - 1;
            System.out.println( list.get(i) );
        }
    }
}

package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("LastName1", "Name1");
        map.put("LastName2", "Name2");
        map.put("LastName3", "Name3");
        map.put("LastName4", "Name4");
        map.put("LastName5", "Name5");
        map.put("LastName6", "Name6");
        map.put("LastName7", "Name7");
        map.put("LastName8", "Name8");
        map.put("LastName9", "Name9");
        map.put("LastName10", "Name10");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for(String value : map.values()) {
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for(String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}

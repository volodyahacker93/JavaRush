package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friendname = null;
    private int friendage;
    private String friendgender = null;

    public void initialize(String name)
    {
        this.friendname = name;
    }

    public void initialize(String name, int age)
    {
        this.friendname = name;
        this.friendage = age;
    }

    public void initialize(String name, int age, String gender)
    {
        this.friendname = name;
        this.friendage = age;
        this.friendgender = gender;
    }
}

package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dogname;
    private int dogheight;
    private String dogcolor;

    public Dog(String name)
    {
        this.dogname = name;
    }

    public Dog(String name, int height)
    {
        this.dogname = name;
        this.dogheight = height;
    }

    public Dog(String name, int height, String color)
    {
        this.dogname = name;
        this.dogheight = height;
        this.dogcolor = color;
    }
}

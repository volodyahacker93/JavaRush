package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dogname;
    private int dogheight;
    private String dogcolor;

    public void initialize (String name){
        this.dogname = name;
    }

    public void initialize (String name, int height){
        this.dogname = name;
        this.dogheight = height;
    }

    public void initialize (String name, int height, String color){
        this.dogname = name;
        this.dogheight = height;
        this.dogcolor = color;
    }
}

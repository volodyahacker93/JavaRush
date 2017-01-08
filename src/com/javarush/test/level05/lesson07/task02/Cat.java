package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catname = null;
    private int catweight = 10;
    private int catage = 5;
    private String catcolor = null;
    private String cataddress = null;


    public void initialize(String name)
    {
        this.catname = name;
    }

    public void initialize(String name, int weight, int age)
    {
        this.catname = name;
        this.catweight = weight;
        this.catage = age;
    }

    public void initialize(String name, int age)
    {
        this.catname = name;
        this.catage = age;
    }

    public void initialize(int weight, String color)
    {
        this.catweight = weight;
        this.catcolor = color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.catweight = weight;
        this.catcolor = color;
        this.cataddress = address;
    }
}

package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int rectangletop;
    private int rectangleleft;
    private int rectanglewidth;
    private int rectangleheight;

    public void initialize (int top, int left, int width, int height) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = width;
        this.rectangleheight = height;
    }

    public void initialize (int top, int left) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = 0;
        this.rectangleheight = 0;
    }

    public void initialize (int top, int left, int width) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = width;
        this.rectangleheight = width;
    }

    public void initialize(Rectangle anotheRectangle )
    {
        anotheRectangle = this;
    }


}

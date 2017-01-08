package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
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

    public Rectangle (int top, int left, int width, int height) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = width;
        this.rectangleheight = height;
    }

    public Rectangle (int top, int left) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = 0;
        this.rectangleheight = 0;
    }

    public Rectangle (int top, int left, int width) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = width;
        this.rectangleheight = width;
    }

    public Rectangle(Rectangle anotheRectangle )
    {
        anotheRectangle = this;
    }


}

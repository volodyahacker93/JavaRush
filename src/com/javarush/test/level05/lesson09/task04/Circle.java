package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int circlecenterX;
    private int circlecenterY;
    private int circleradius;
    private int circlewidth;
    private int circlecolor;

    public Circle (int centerX, int centerY, int radius){
        this.circlecenterX = centerX;
        this.circlecenterY = centerY;
        this.circleradius = radius;
    }

    public Circle (int centerX, int centerY, int radius, int width) {
        this.circlecenterX = centerX;
        this.circlecenterY = centerY;
        this.circleradius = radius;
        this.circlewidth = width;
    }

    public Circle (int centerX, int centerY, int radius, int width, int color) {
        this.circlecenterX = centerX;
        this.circlecenterY = centerY;
        this.circleradius = radius;
        this.circlewidth = width;
        this.circlecolor = color;
    }

}

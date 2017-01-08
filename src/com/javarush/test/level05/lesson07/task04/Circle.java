package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
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

    public void initialize (int centerX, int centerY, int radius){
        this.circlecenterX = centerX;
        this.circlecenterY = centerY;
        this.circleradius = radius;
    }

    public void initialize (int centerX, int centerY, int radius, int width) {
        this.circlecenterX = centerX;
        this.circlecenterY = centerY;
        this.circleradius = radius;
        this.circlewidth = width;
    }

    public void initialize (int centerX, int centerY, int radius, int width, int color) {
        this.circlecenterX = centerX;
        this.circlecenterY = centerY;
        this.circleradius = radius;
        this.circlewidth = width;
        this.circlecolor = color;
    }

}

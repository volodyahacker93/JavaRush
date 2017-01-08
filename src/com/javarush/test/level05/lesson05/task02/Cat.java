package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int incAge;
        if (this.age > anotherCat.age)
        {
            incAge = 1;
        }
        else incAge = 0;

        int incWeight;
        if (this.weight > anotherCat.weight)
        {
            incWeight = 1;
        }
        else incWeight = 0;

        int incStrength;
        if (this.strength > anotherCat.strength)
        {
            incStrength = 1;
        }
        else incStrength = 0;

        return (incAge+incWeight+incStrength)>0;

    }
}

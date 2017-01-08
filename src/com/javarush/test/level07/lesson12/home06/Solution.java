package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human human5 = new Human("Оля", false, 57);
        Human human6 = new Human("Тарас", true, 58);
        Human human3 = new Human("Катя", false, 55);
        Human human4 = new Human("Павел", true, 56);
        Human human2 = new Human("Аня", false, 21, human4, human3);
        Human human7 = new Human("Михаил", true, 22, human6, human5);
        Human human8 = new Human("Игорь", true, 2, human7, human2);
        Human human9 = new Human("Вася", true, 3, human7, human2);
        Human human10 = new Human("Люба", false, 1, human7, human2);

        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
        System.out.println(human10.toString());
    }

    public static class Human
    {
        String name;
        Boolean sex;
        Integer age;
        Human father;
        Human mother;

        Human(String name1, Boolean sex1, Integer age1, Human father1, Human mother1)
        {
            this.name = name1;
            this.sex = sex1;
            this.age = age1;
            this.father = father1;
            this.mother = mother1;
        }

        Human(String name1, Boolean sex1, Integer age1)
        {
            this.name = name1;
            this.sex = sex1;
            this.age = age1;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}

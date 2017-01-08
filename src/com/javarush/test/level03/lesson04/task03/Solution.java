package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg11";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg12";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg13";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg14";
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg15";
        Zerg zerg6 = new Zerg();
        zerg6.name = "zerg16";
        Zerg zerg7 = new Zerg();
        zerg7.name = "zerg17";
        Zerg zerg8 = new Zerg();
        zerg8.name = "zerg18";
        Zerg zerg9 = new Zerg();
        zerg9.name = "zerg19";
        Zerg zerg10 = new Zerg();
        zerg10.name = "zerg110";
        Protos protos1 = new Protos();
        protos1.name = "protos11";
        Protos protos2 = new Protos();
        protos2.name = "protos12";
        Protos protos3 = new Protos();
        protos3.name = "protos13";
        Protos protos4 = new Protos();
        protos4.name = "protos14";
        Protos protos5 = new Protos();
        protos5.name = "protos15";
        Terran terran1 = new Terran();
        terran1.name = "terran1";
        Terran terran2 = new Terran();
        terran2.name = "terran2";
        Terran terran3 = new Terran();
        terran3.name = "terran3";
        Terran terran4 = new Terran();
        terran4.name = "terran4";
        Terran terran5 = new Terran();
        terran5.name = "terran5";
        Terran terran6 = new Terran();
        terran6.name = "terran6";
        Terran terran7 = new Terran();
        terran7.name = "terran7";
        Terran terran8 = new Terran();
        terran8.name = "terran8";
        Terran terran9 = new Terran();
        terran9.name = "terran9";
        Terran terran10 = new Terran();
        terran10.name = "terran10";
        Terran terran11 = new Terran();
        terran11.name = "terran11";
        Terran terran12 = new Terran();
        terran12.name = "terran12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
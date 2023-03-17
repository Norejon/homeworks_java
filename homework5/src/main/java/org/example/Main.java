package org.example;

import part3.Automobil;
import part3.Owner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //part1
//        ArrayList<String> list = new ArrayList<String>(15);
//        list.add("dasd");
//        list.add("qwdwqd");
//        list.add("vcxvcxvdv");
//        list.add("sd");
//        list.add("dsfdfbfgb");
//        list.add(";;'ll;,;l,");
//        list.add("vc;lvplefd");
//        list.add("asdxccvdv");
//        list.add("v;bvclbl;c,");
//        list.add(".nl,gggdf");
//        list.add("vlvd;s;");
//        list.add("zxcxzc");
//        list.add("gfrfdsadqw");
//        list.add("jiljlkj");
//        list.add("iltrkjg");
//
//        ArrayList<String> sorted = (ArrayList<String>) list.stream().sorted().collect(Collectors.toList());
//        System.out.println(sorted);
//        ArrayList<String> filtred  = (ArrayList<String>) list.stream().filter(a->a.length()<4).collect(Collectors.toList());
//        System.out.println(filtred);

        //part2

//        ArrayList<Integer> massiv = new ArrayList<Integer>(20);
//        massiv.add(3);
//        massiv.add(43);
//        massiv.add(213);
//        massiv.add(1);
//        massiv.add(567);
//        massiv.add(54);
//        massiv.add(87);
//        massiv.add(680);
//        massiv.add(24);
//        massiv.add(879);
//        massiv.add(20);
//        massiv.add(567);
//        massiv.add(55);
//        massiv.add(7987);
//        massiv.add(34);
//        massiv.add(244);
//        massiv.add(67);
//        massiv.add(9);
//        massiv.add(213);
//        massiv.add(44);
//
//        System.out.println(massiv.stream().sorted().collect(Collectors.toList()));
//        System.out.println(massiv.stream().filter(a->a%3==0).collect(Collectors.toList()));
//        System.out.println(massiv.stream().filter(a->a%10==0).collect(Collectors.toList()));
//        for (int a:massiv) {
//            System.out.println(a);
//        }
//        System.out.println(massiv.stream().map(a->a*3).collect(Collectors.toList()));

        //part3
        Automobil auto1 = new Automobil("Mercedes", 2.3, new Owner("Hans", 32, 7), 30000, 2015);
        Automobil auto2 = new Automobil("Zaporojets", 4, new Owner("Mykola", 31, 15), 400, 2025);
        Automobil auto3 = new Automobil("Toyota", 1.5, new Owner("Denys", 25, 3), 25000, 2018);
        Automobil auto4 = new Automobil("Lexus", 2.5, new Owner("Valeria", 28, 9), 35000, 2019);
        Automobil auto5 = new Automobil("Hundai", 1.6, new Owner("Iryna", 22, 2), 20000, 2013);
        Automobil auto6 = new Automobil("BMW", 2.0, new Owner("Victoria", 26, 5), 26000, 2016);
        Automobil auto7 = new Automobil("Mercedes", 3, new Owner("Jan", 19, 1), 20000, 2014);
        Automobil auto8 = new Automobil("Volga", 1.1, new Owner("Smith", 49, 4), 10000, 1997);


        ArrayList<Automobil> autopark = new ArrayList<>();
        autopark.add(auto1);
        autopark.add(auto2);
        autopark.add(auto3);
        autopark.add(auto4);
        autopark.add(auto5);
        autopark.add(auto6);
        autopark.add(auto7);
        autopark.add(auto8);

        System.out.println(autopark);
        Iterator<Automobil> automobil = autopark.iterator();
        for (int i = 0; i < autopark.size() / 2; i++) {
            automobil.next().setMorePowerEngine(10);
        }
        System.out.println(autopark);

        autopark.stream().filter(automobil1 -> automobil1.getOwner().getStage() < 5 && automobil1.getOwner().getYears() > 25).forEach(automobil1 -> automobil1.getOwner().plusCvalification());

        System.out.println(autopark);

        Iterator<Automobil> cost = autopark.iterator();
        int sumAll=0;
      for (int i = 0;i<autopark.size();i++) {
          sumAll = sumAll + cost.next().getCost();
      }
        System.out.println(sumAll);
    }
}
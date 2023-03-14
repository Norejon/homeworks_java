package org.example;

import part4.Person;
import part4.Pet;
import part4.Poroda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //part1
//        List<User> users = new ArrayList<>();
//        users.add(new User(2,32,"Danylo"));
//        users.add(new User(1,20,"Anna"));
//        users.add(new User(3,22,"Sophiya"));
//        users.add(new User(5,27,"Jenya"));
//        users.add(new User(4,17,"Adam"));
//
//        List<User> sorted = users.stream().sorted((u1,u2)->u1.getAge()-u2.getAge()).collect(Collectors.toList());
//        System.out.println(sorted);
//        List<User> sortedreverse = users.stream().sorted((u1,u2)->u2.getAge()-u1.getAge()).collect(Collectors.toList());
//        System.out.println(sortedreverse);
//
//        //alternative variant
////        users.sort(Comparator.comparing(user -> user.getAge()));
////        System.out.println(users);
////        users.sort(Comparator.comparing(user -> -user.getAge()));
////        System.out.println(users);

        //part2
//        List<String> words = new LinkedList<String>();
//        words.add("gssass");
//        words.add("wasd");
//        words.add("shfghsad");
//        words.add("fghfg");
//        words.add("rfds");
//        words.add("xzq");
//        words.add("cxz");
//        words.add("dasdw");
//        words.add("uyk");
//        words.add("ngfn");
//        words.add("gffgnbgf");
//        words.add("fgbxcv");
//        words.add("trbsfg");
//        words.add("csaxzx");
//        words.add("a");
//        words.add("qqqqqqqqqqqqqqqq");
//
//        List<String> sorted = words.stream().sorted().collect(Collectors.toList());
//        System.out.println(sorted);

        //part3
//        LinkedList<Skills> skills1 = new LinkedList<Skills>();
//        skills1.add(new Skills("java", 10));
//        LinkedList<Skills> skills2 = new LinkedList<Skills>();
//        skills2.add(new Skills("java", 10));
//        skills2.add(new Skills("html", 5));
//        LinkedList<Skills> skills3 = new LinkedList<Skills>();
//        skills3.add(new Skills("java", 10));
//        skills3.add(new Skills("html", 5));
//        skills3.add(new Skills("pro", 1000));


        //v1
//        Set<Human> humans = new HashSet<Human>();
        //v2
//        Set<Human> humans = new TreeSet<Human>();
//
//        humans.add(new Human(2,"Nick","Smith","bobik@gmail.com",22, Gender.MALE,skills2,"zaporojets",1990,1488));
//        humans.add(new Human(1,"Olha","Faynenko","fayna@gmail.com",22, Gender.FEMALE,skills3,"zaporojets",1990,1488));
//        humans.add(new Human(0,"Sem","Brevson","asdsad@gmail.com",22, Gender.MALE,skills3,"zaporojets",1990,1488));
//        humans.add(new Human(3,"Vira","Podorojnyk","wqeqwe@gmail.com",22, Gender.FEMALE,skills1,"zaporojets",1990,1488));
//        humans.add(new Human(9,"Chrystya","Vodyanska","ss@gmail.com",22, Gender.FEMALE,skills3,"zaporojets",1488,1488));
//        humans.add(new Human(5,"Robert","Shurker","nebot@gmail.com",22, Gender.MALE,skills2,"zaporojets",1990,1488));
//        humans.add(new Human(6,"Vasyl","Graf","vseya@gmail.com",22, Gender.MALE,skills1,"zaporojets",1990,1488));
//        humans.add(new Human(7,"Yaroslav","Kamyaniy","sdobuv@gmail.com",22, Gender.MALE,skills2,"zaporojets",1990,1488));
//        humans.add(new Human(8,"Albert","Tumbochkos","albert@vtumbochtsi.com",22, Gender.MALE,skills1,"zaporojets",1990,1488));
//        humans.add(new Human(4,"Nina","Smith","zdoh@gmail.com",22, Gender.FEMALE,skills3,"zaporojets",1990,1488));
//
//        Iterator<Human> iterator = humans.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//        }
        //v1
//        humans.removeIf(human -> human.getGender() ==Gender.MALE);
//        System.out.println(humans);
        //v2
//        System.out.println(humans);

        //part4
        LinkedList<Pet> pets = new LinkedList<Pet>();
        pets.add(new Pet("Barsick", Poroda.DOG));
        ArrayList<Person> zooclub = new ArrayList<>();
        zooclub.add(new Person("swq",pets));
        System.out.println(zooclub);

        Person Ant = new Person("Anton");
        //add member of club
        zooclub.add(new Person("Maxym"));
        zooclub.add(new Person("Denys",pets));
        zooclub.add(Ant);
        System.out.println(zooclub);

        Iterator<Person> club =  zooclub.stream().iterator();
        while (club.hasNext()){
            System.out.println(club.next());
        }
        //delete pet from all mempers
        pets.removeIf(pet -> pet.getName()=="Barsick");
        System.out.println(zooclub);

        Ant.setPets(pets);
        System.out.println(zooclub);
    }
}
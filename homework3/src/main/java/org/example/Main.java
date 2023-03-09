package org.example;

import Part1.Book;
import Part1.Magazine;
import Part1.Printable;
import part2.Baraban;
import part2.Guitar;
import part2.Instrument;
import part2.Truba;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //part1
//        ArrayList<Printable> print = new ArrayList<Printable>();
//        print.add(new Book());
//        print.add(new Magazine());
//        print.add(new Magazine());
//        print.add(new Book());
        //*************************************

        //part2
        ArrayList<Instrument> instruments = new ArrayList<Instrument>();
        instruments.add(new Guitar(5));
        instruments.add(new Truba(20));
        instruments.add(new Baraban(50));
        instruments.add(new Truba(30));
        instruments.add(new Truba(15));
        instruments.add(new Guitar(7));
        instruments.add(new Baraban(100));
        instruments.add(new Truba(40));

        for(Instrument instrument: instruments){
            instrument.play();
        }



    }
}
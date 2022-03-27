package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Box> box1 = new LinkedList<>();
        box1.add(new Box<>(4235));
        box1.add(new Box<>(24));
        box1.add(new Box<>(456));
        box1.add(new Box<>(129));
        box1.add(new Box<>("Aziz"));
        box1.add(new Box<>("Azizulin"));
        box1.add(new Box<>("Askat"));
        box1.add(new Box<>("Aziret"));

        Box<Integer> box2 = new Box<>(567);
        Box<String> box3 = new Box<>("Almaz");

        System.out.print("\n" + " Box number 1:" + Box.method(box1 + " "));
        System.out.print("\n" + " Box number 2:" +Box.method(box2 + " "));
        System.out.print("\n" + " Box number 3:" +Box.method(box3 + " "));
    }
}

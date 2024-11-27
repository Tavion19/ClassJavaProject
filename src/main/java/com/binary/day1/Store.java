package com.binary.day1;

public class Store {
    public static void main(String[] args) {


        Table table1 = new Table();

        System.out.println(table1.color);

        table1.setColor("orange");

        System.out.println(table1.getColor());


        table1.setHeight(50);

        System.out.println(table1.getHeight());


        table1.setWidth(25);
        System.out.println(table1.getWidth());

        table1.setLength(70);
        System.out.println(table1.getLength());





    }


}

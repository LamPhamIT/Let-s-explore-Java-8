package org.example;

import org.example.filter.Filter;
import org.example.resource.Apple;
import org.example.resource.Color;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Tao do", 100, Color.RED));
        list.add(new Apple("Tao my", 120, Color.RED));
        list.add(new Apple("Tao Viet Nam", 150, Color.GREEN));

        list = Filter.filter(list, apple -> apple.getColor().toString().equals(Color.RED.toString()));

        for (Apple apple : list
        ) {
            System.out.println(apple.toString());
        }
    }
}
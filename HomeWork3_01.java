package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
*/
public class HomeWork3_01 extends HomeWork3 {
    private static final int LIST_SIZE = 10;
    private static final int MAX_RND = 100;

    public HomeWork3_01(String description, Scanner scanner) {
        super(description, scanner);
    }

    public void run() {
        super.run();

        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < LIST_SIZE; i++) {
            array.add(random.nextInt(MAX_RND));
        }
        System.out.println("Исходный лист:");
        System.out.println(array.toString());

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) %2 ==0) {
                array.remove(i);
                --i;
            }
        }
        System.out.println("Лист с удалёнными чётными числами:");
        System.out.println(array.toString());
    }
}

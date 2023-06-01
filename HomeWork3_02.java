package ru.gb;

import java.util.*;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное
и среднее арифметическое из этого списка. Collections.max()
*/
public class HomeWork3_02 extends HomeWork3 {
    private static final int LIST_SIZE = 10;
    private static final int MAX_RND = 100;

    public HomeWork3_02(String description, Scanner scanner) {
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

        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }

        System.out.printf("Минимальное значение: %d, максимальное значение: %d, среднее арифметическое: %f\n",
                Collections.min(array), Collections.max(array), (double)sum / LIST_SIZE);
    }
}

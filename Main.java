/*
Урок 3. Коллекции JAVA: Введение

1. Пусть дан произвольный список целых чисел, удалить из него четные числа

2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
и среднее арифметическое из этого списка. Collections.max()
*/
package ru.gb;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson_03("Урок 3. Коллекции JAVA: Введение");

        while (true) {
            int choice = lesson.menu();

            if (choice == -1)
                break;

            System.out.printf("Задание номер %d\n", choice + 1);
            System.out.println("===============");

            lesson.runExercise(choice);
            waitForEnter();
        }
    }

    private static void waitForEnter() {
        System.out.print("\nНажмите Enter для продолжения...");

        try {
            System.in.skip(System.in.available());
            System.in.read();
        } catch (Exception e) {
        }
        System.out.println();
    }
}

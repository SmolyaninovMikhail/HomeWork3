package ru.gb;

public class Lesson_03 extends Lesson {
    public Lesson_03(String title) {
        super(title);

        addExercise(new HomeWork3_01("Пусть дан произвольный список целых чисел, удалить из него четные числа",
                getScanner()));

        addExercise(new HomeWork3_02("Задан целочисленный список ArrayList. Найти минимальное, максимальное\n" +
                "и среднее арифметическое из этого списка.",
                getScanner()));
    }
}

package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson {
    private String title;
    private Scanner scanner = new Scanner(System.in);
    private List<HomeWork3> exercises = new ArrayList<>();

    public Lesson(String title) {
        this.title = title;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void showExercises() {
        for (int i = 0; i < exercises.size(); i++) {
            System.out.printf("%d: %s\n\n", i + 1, exercises.get(i));
        }
    }

    public void addExercise(HomeWork3 ex) {
        exercises.add(ex);
    }

    public void runExercise(int num) {
        exercises.get(num).run();
    }

    public int menu() {
        System.out.printf("%s\n", this);

        showExercises();

        while (true) {
            System.out.print("Введите номер задания или нажмите 'Q' для выхода: ");

            char ch = scanner.next().charAt(0);
            if (ch == 'q' || ch == 'Q') {
                return -1;
            }

            int choice = Character.getNumericValue(ch);
            if (choice >= 1 && choice <= exercises.size()) {
                System.out.println();
                return choice - 1;
            }

            System.out.println("Неправильный ввод");
        }
    }

    @Override
    public String toString() {
        return title;
    }
}

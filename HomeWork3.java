package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork3 {
    private String description;
    private Scanner scanner;

    public HomeWork3(String description, Scanner scanner) {
        this.description = description;
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void run() {
        System.out.println(description);
        System.out.println("===============");
    }

    @Override
    public String toString() {
        return description;
    }
}

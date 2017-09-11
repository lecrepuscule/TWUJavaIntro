package com.company;

public class Main {

    public static void drawAsterisk() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        drawAsterisk();
        drawHorizontalLine(Integer.parseInt(args[0]));

    }
}

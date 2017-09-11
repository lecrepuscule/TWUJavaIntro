package com.company;

public class Main {

    public static void drawAsterisk() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            drawHorizontalLine(i);
        }

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        drawAsterisk();
        System.out.println("draw horizontal line");
        drawHorizontalLine(n);

        System.out.println("draw vertical line");
        drawVerticalLine(n);

        System.out.println("draw right triangle");
        drawRightTriangle(n);

    }
}

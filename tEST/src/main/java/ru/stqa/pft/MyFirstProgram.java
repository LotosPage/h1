package ru.stqa.pft;

import java.sql.SQLOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
        double l = 5;
        System.out.println("Площадь квадрта со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}

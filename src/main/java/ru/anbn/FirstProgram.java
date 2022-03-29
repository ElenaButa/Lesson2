package ru.anbn;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        Point pointA = new Point();
        Point pointB = new Point();

        // введем в консоли координаты точки A
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки А:");

        System.out.print("x  = ");
        pointA.x = in.nextInt();
        System.out.print("y  = ");
        pointA.y = in.nextInt();

        // введем в консоли координаты точки B
        System.out.println("Введите координаты точки B:");

        System.out.print("x  = ");
        pointB.x = in.nextInt();
        System.out.print("y  = ");
        pointB.y = in.nextInt();

        System.out.println(); //пробел межстрочный для наглядности вывода

        // вычислим расстояние между точками в функции класса MyFirstProgram
        distanceFunction(pointA, pointB);
        System.out.println();  //пробел межстрочный для наглядности вывода

        // вычислим расстояние между точками в методе класса Point
        Point p = new Point();
        System.out.println("Вычисление расстояния в задаче (в методе класса Point):");
        System.out.println("Расстояние между точками A и B = " + p.distanceMethod(pointA, pointB));

    }

    // вычислим расстояние между точками
    public static void distanceFunction(Point A, Point B) {
        // переменные для расчета сторон треугольника
        int a, b;
        double c;
        a = Math.abs(A.x - B.x);
        b = Math.abs(A.y - B.y);
        c = Math.sqrt(a * a + b * b);
        System.out.println("Вычисление расстояния в задаче (в функции):");
        // System.out.println(MessageFormat.format("Расстояние между точками A и B = {0}", c));//String.format("%.2f", c)));
        System.out.println("Расстояние между точками A и B = " + c);
    }

}
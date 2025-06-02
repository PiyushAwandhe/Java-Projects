package com.example.util;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(circle.radius, 2);
        double rectArea = rectangle.length * rectangle.width;

        System.out.println("Area of Circle is: " + cirArea);
        System.out.println("Area of Rectangle is: " + rectArea);
    }
}

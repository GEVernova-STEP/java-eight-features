package com.gevernova.javaeightfeatures.methodreference.methodreference_functionalinterface;

public class Main {
    public static void main(String[] args) {

        Calculator add = MathOperations::add;
        Calculator subtract = MathOperations::subtract;
        Calculator multiply = MathOperations::multiply;
        Calculator divide = MathOperations::divide;

        System.out.println(add.calculate(2, 4));
        System.out.println(subtract.calculate(6, 3));
        System.out.println(multiply.calculate(7, 2));
        System.out.println(divide.calculate(8,2));


    }
}

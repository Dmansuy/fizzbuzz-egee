package com.egencia.fizzbuzz;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        List<String> result = fizzBuzzService.generate(20);

        for (String aResult : result) {
            System.out.print(aResult + " ");
        }
    }
}

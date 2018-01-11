package com.egencia.fizzbuzz;

import java.util.Collections;
import java.util.List;

public class FizzbuzzService {
    public List<Integer> generate(int myNumber) {

        for (int i = 1; i < myNumber; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else {
                if (i % 3 == 0 || i % 5 == 0) {
                    if (i % 3 == 0) {
                        System.out.print(" Fizz ");
                    }
                    if (i % 5 == 0) {
                        System.out.print(" Buzz ");
                    }
                } else {
                    System.out.print(" " + i + " ");
                }
            }
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        FizzbuzzService fizzbuzzService = new FizzbuzzService();

        System.out.println(fizzbuzzService.generate(17));
    }
}

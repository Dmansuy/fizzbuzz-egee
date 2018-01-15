package com.egencia.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzService {

    public List<String> generate(int goal) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i < goal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}

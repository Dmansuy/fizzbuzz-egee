package com.egencia.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzbuzzService {

    public String generate(int goal) {
        boolean isDivisibleByThree = goal % 3 == 0;
        boolean isDivisibleByFive = goal % 5 == 0;

        if (goal <= 0) {
            return "";
        }
        if (isDivisibleByThree && isDivisibleByFive) {
            return "Fizzbuzz";
        }
        if (isDivisibleByFive) {
            return "Buzz";
        } else if (isDivisibleByThree) {
            return "Fizz";
        }
        return String.valueOf(goal);
    }

    public List<String> generateList(int number) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            result.add(generate(i));
        }
        return result;
    }
}

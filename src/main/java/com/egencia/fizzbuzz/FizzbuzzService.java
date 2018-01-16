package com.egencia.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzbuzzService {

    public String generate(int goal) {

        String result;
        boolean isDividibleByThree = goal % 3 == 0;
        boolean isDivisibleByFive = goal % 5 == 0;

        if (goal <= 0) {
            result = "";
        } else {
            if (isDividibleByThree && isDivisibleByFive) {
                result = "Fizzbuzz";
            } else if (isDivisibleByFive) {
                result = "Buzz";
            } else if (isDividibleByThree) {
                result = "Fizz";
            } else {
                result = String.valueOf(goal);
            }
        }

        return result;
    }

    public List<String> putInListTheResultOfGenerateFunction(int number) {

        FizzbuzzService fizzbuzzService = new FizzbuzzService();
        List<String> listOfFizzbuzz = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            String result = fizzbuzzService.generate(i);
            listOfFizzbuzz.add(result);
        }
        return listOfFizzbuzz;
    }
}

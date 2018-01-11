package com.egencia.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class FizzbuzzService {
    public List<String> generate(int goal) {

        List<String> result = new ArrayList<>();
        for (int i = 1; i < goal; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else {
                if (i % 3 == 0 || i % 5 == 0) {
                    if (i % 3 == 0) {
                        result.add("Fizz");
                    }
                    if (i % 5 == 0) {
                        result.add("Buzz");
                    }
                } else {
                    String number = String.valueOf(i);
                    result.add(number);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FizzbuzzService fizzbuzzService = new FizzbuzzService();

        //System.out.println(fizzbuzzService.generate(17));
        List<String> result = fizzbuzzService.generate(17);

        String collect = result.stream()
                .collect(joining(" "));

        System.out.println(collect);
    }
}

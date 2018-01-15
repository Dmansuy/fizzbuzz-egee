package com.egencia.fizzbuzz

import java.util.ArrayList

class FizzBuzzService {

    fun generate(goal: Int): List<String> {

        val result = ArrayList<String>()

        for (i in 1 until goal) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz")
            } else if (i % 3 == 0) {
                result.add("Fizz")
            } else if (i % 5 == 0) {
                result.add("Buzz")
            } else {
                result.add(i.toString())
            }
        }
        return result
    }
}

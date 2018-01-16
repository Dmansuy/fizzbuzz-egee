package com.egencia.fizzbuzz;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FizzbuzzService fizzbuzzService = new FizzbuzzService();
        List<String> result = fizzbuzzService.putInListTheResultOfGenerateFunction(17);

        for (String aResult : result) {
            System.out.print(aResult + " ");
        }
    }
}

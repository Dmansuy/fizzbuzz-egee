package com.egencia.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzbuzzServiceTest {

    private FizzbuzzService fizzbuzzService = new FizzbuzzService();

    @Test
    public void should_return_empty_string_when_zero() {
        String result = fizzbuzzService.generate(0);

        assertThat(result).isEqualTo("");
    }

    @Test
    public void should_return_empty_string_when_negative_number() {
        String result = fizzbuzzService.generate(-42);

        assertThat(result).isEqualTo("");
    }

    @Test
    public void should_display_number_given_positive_number() {
        String result = fizzbuzzService.generate(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_display_number_given_positive_number2() {
        String result = fizzbuzzService.generate(2);

        assertThat(result).isEqualTo("2");
    }

    @Test
    public void should_display_fizz_given_multiple_of_3() {
        assertThat(fizzbuzzService.generate(3)).isEqualTo("Fizz");
        assertThat(fizzbuzzService.generate(6)).isEqualTo("Fizz");
        assertThat(fizzbuzzService.generate(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_display_buzz_given_multiple_of_5() {
        assertThat(fizzbuzzService.generate(5)).isEqualTo("Buzz");
        assertThat(fizzbuzzService.generate(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_display_fizzbuzz_given_multiple_of_3_and_5() {
        assertThat(fizzbuzzService.generate(15)).isEqualTo("Fizzbuzz");
        assertThat(fizzbuzzService.generate(30)).isEqualTo("Fizzbuzz");
    }

    @Test
    public void should_return_a_fizzbuzz_list() {
        assertThat(fizzbuzzService.generateList(4)).containsExactly("1", "2", "Fizz", "4");
        assertThat(fizzbuzzService.generateList(17)).containsExactly("1", "2", "Fizz", "4", "Buzz", "Fizz", "7",
                "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizzbuzz", "16", "17");
    }
}
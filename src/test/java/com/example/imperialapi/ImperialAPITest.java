package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImperialAPITest {

    ImperialAPI imperialAPI = new ImperialAPI();

    @Test
    void gramTest(){
        double ounce = 1;

        double expected = 28.35;

        double result = imperialAPI.gram(ounce);

        assertEquals(expected, result);

    }

    @Test
    void kilogramTest(){
        double stone = 1;

        double expected = 6.35;

        double result = imperialAPI.kilogram(stone);

        assertEquals(expected, result);
    }
}

package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortingCitiesTest {
    SortingCities sortingCities;


    @Before
    public void setUp() {
        sortingCities = new SortingCities();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void convertToUpperCase() {
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        String[] expectedResult = {"BERN", "LUCERNE", "INTERLAKEN", "GRINDELWALD", "ENGELBERG", "GENEVA", "MURREN", "BASEL", "ZERMATT", "JUNGFRAUJOCH"};
        String actualResult = sortingCities.convertToUpperCase(String.valueOf((cityNames)));
        assertArrayEquals(expectedResult, actualResult);

    }

    private void assertArrayEquals(String[] expectedResult, String actualResult) {

    }


    @Test
    public void citySorting() {
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        int[] expectedResult = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        String actualResult = Arrays.toString(sortingCities.citySorting(distance));
        assertArrayEquals(expectedResult, actualResult);
    }

    private void assertArrayEquals(int[] expectedResult, String actualResult) {
    }

    private void assertArrayEquals(int[] expectedResult, int[] actualResult) {


    }

    @Test
    public void toFindTheCity() {
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};

        int expectedResult = 276;
        int actualResult;
        actualResult = (int) sortingCities.toFindTheCity(distance);
        assertArrayEquals(expectedResult, actualResult);


    }

    private void assertArrayEquals(int expectedResult, int actualResult) {

    }

    @Test
    public void tofindTheCityAbove() {
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        int expectedResult = 52;
        int actualResult;
        actualResult = (int) sortingCities.tofindTheCityAbove(distance);

    }
}
//write all the test cases here


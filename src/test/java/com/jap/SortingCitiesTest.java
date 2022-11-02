package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortingCitiesTest {
    SortingCities sortingCities;


    @Before
    public void setUp() {
        sortingCities = new SortingCities();
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};

    }

    @After
    public void tearDown() {
    }

    @Test
    public void citySorting() {
        int[] distances = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};

    }
//write all the test cases here
}
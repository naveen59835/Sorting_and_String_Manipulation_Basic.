package com.jap;

import java.util.Arrays;

/**
 * Hello world!
 */
public class SortingCities {
    public static void main(String[] args) {
        SortingCities sortingCities = new SortingCities();
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};


        int[] kilometers = sortingCities.citySorting(distance);
        for (int kilometer : distance) {
            System.out.println(kilometer);


        }
        String sortedAlphabet = sortingCities.convertToUpperCase(Arrays.toString(cityNames));
        System.out.println("Hi caroline the Sorted alphabet is " + sortedAlphabet);
        int km1 = distance.length;


        System.out.println("Hi caroline the city which is 270 kms from Zurich is " + sortingCities.toFindTheCity(distance) + " " + "kms is".concat(cityNames[5]));
        System.out.println("Hi caroline the city which is 52 kms from Zurich is " + sortingCities.tofindTheCityAbove(distance) + " " + "kms is".concat(cityNames[1]));


    }

    public int[] citySorting(int[] kms) {
        int temp;

        for (int pass = 0; pass < kms.length; pass++) {
            for (int index = 0; index < kms.length - 1; index++) {
                if (kms[index] > kms[index + 1]) {
                    temp = kms[index + 1];
                    kms[index + 1] = kms[index];
                    kms[index] = temp;

                }

            }

        }
        return kms;


    }

    public String convertToUpperCase(String cityNames) {
        String names = cityNames.toUpperCase();
        String upper = names.toUpperCase();
        return upper;
    }

    public Object toFindTheCity(int[] distance) {
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] > 270) {
                return distance[i];
            }

        }
        return " ";
    }

    public Object tofindTheCityAbove(int[] distance) {
        for (int index = 0; index < distance.length; index++) {
            if (distance[index] >= 50) {
                return distance[index];
            }

        }
        return " ";
    }


}








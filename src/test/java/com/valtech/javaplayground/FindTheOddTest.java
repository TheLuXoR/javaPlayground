/*
 * FindTheOddTest.java
 *
 * Created on 2020-04-06
 *
 * Copyright (C) 2020 Volkswagen AG, All rights reserved.
 */

package com.valtech.javaplayground;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FindTheOddTest {

    @org.junit.Test
    public void getTheOddOneWhenNumbersAreEven() {
        final ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(4);
        integers.add(6);
        integers.add(7);
        integers.add(10);
        integers.add(12);

        final FindTheOutsider findTheOdd = new FindTheOutsider();

        final int theOddOne = findTheOdd.findTheOutsider(integers);

        assertEquals(theOddOne, 7);
    }

    @org.junit.Test
    public void getTheEvenOneWhenNumbersAreOdd() {
        final ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(3);
        integers.add(9);
        integers.add(17);
        integers.add(123);
        integers.add(6);

        final FindTheOutsider findTheOdd = new FindTheOutsider();

        final int theEvenOne = findTheOdd.findTheOutsider(integers);

        assertEquals(6, theEvenOne);
    }
}
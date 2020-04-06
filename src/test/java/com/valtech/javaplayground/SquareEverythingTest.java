/*
 * SquareEverythingTest.java
 *
 * Created on 2020-04-06
 *
 * Copyright (C) 2020 Volkswagen AG, All rights reserved.
 */

package com.valtech.javaplayground;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareEverythingTest {

    @Test
    public void getSquaresWhenExampleOneIsInjected() {
        final SquareEverything squareEverything = new SquareEverything();
        final String squares = squareEverything.getSquares(1234);

        assertEquals("14916",squares);
    }

    public void getSquaresWhenExampleTwoIsInjected() {
        final SquareEverything squareEverything = new SquareEverything();
        final String squares = squareEverything.getSquares(9124);

        assertEquals("811416",squares);
    }
}
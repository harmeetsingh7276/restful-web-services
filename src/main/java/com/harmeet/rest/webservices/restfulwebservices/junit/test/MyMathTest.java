package com.harmeet.rest.webservices.restfulwebservices.junit.test;

import com.harmeet.rest.webservices.restfulwebservices.junit.src.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {
    MyMath myMath = new MyMath();
    @Test
    void calculate_ThreeMemberArray() {
        assertEquals(6, myMath.calculateSum(new int[]{1, 2, 3}));
    }
    @Test
    void calculate_Zero() {
        assertEquals(0, myMath.calculateSum(new int[]{}));
    }
}

package com.harmeet.rest.webservices.restfulwebservices.junit.test;

import com.harmeet.rest.webservices.restfulwebservices.junit.src.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {
    @Test
    void test() {
        int[] numbers = {1, 2, 3};
        MyMath myMath = new MyMath();
        int result = myMath.calculateSum(numbers);
        System.out.println(result);
        int expectedResult = 5;
        assertEquals(expectedResult, result);
    }
}

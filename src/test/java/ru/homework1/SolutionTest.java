package ru.homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class SolutionTest {

    @ParameterizedTest
    @ValueSource(strings ={"609", "11", "109601", "80808"})
    void isStrobogrammaticTestTrue(String num){
        Solution solution = new Solution();
        boolean result = solution.isStrobogrammatic(num);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"7564", "10654", "7563"})
    void isStrobogrammaticTestFalse(String num){
        Solution solution = new Solution();
        boolean result = solution.isStrobogrammatic(num);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints ={64, 256, 1024, 4096})
    void isPowerOfFourTestTrue(int num){
        Solution solution = new Solution();
        boolean result = solution.isPowerOfFour(num);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints ={5, 15, 128, 512})
    void isPowerOfFourTestFalse(int num){
        Solution solution = new Solution();
        boolean result = solution.isPowerOfFour(num);
        Assertions.assertFalse(result);
    }

}
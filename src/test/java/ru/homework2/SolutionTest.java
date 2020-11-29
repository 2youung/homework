package ru.homework2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int arr[] = new int[]{4, 3, 2, 1, 4};
        int result = solution.maxArea(arr);
        Assertions.assertEquals(result, 16);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int arr[] = new int[]{1, 1};
        int result = solution.maxArea(arr);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int arr[] = new int[]{1, 2, 1};
        int result = solution.maxArea(arr);
        Assertions.assertEquals(result, 2);
    }
}
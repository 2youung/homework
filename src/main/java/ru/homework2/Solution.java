package ru.homework2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("The max area is " + maxArea(arr));
    }

    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right){
            int area = (right-left) * Math.min(height[left], height[right]);
            if (area > maxArea) maxArea = area;
            if (height[left] < height[right]){
                left++;
            } else right--;
        }
        return maxArea;
    }

}
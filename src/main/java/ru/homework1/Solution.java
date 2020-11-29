package ru.homework1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The entered number is strobogrammatic, this is " + isStrobogrammatic(sc.nextLine()));
        System.out.println(isPowerOfFour(sc.nextInt()) ? "The number is power of four" : "The number is not power of four");
    }

    public static boolean isStrobogrammatic(String str){
        char[] number = str.toCharArray();
        int left = 0;
        int right = number.length-1;
        boolean check = false;
        while (left < right){
            if (number[left] == '6' && number[right] == '9' || number[left] == '9' && number[right] == '6'){
                check = true;
            } else if ((number[left] == '1' && number[right] == '1') || (number[left] == '0' && number[right] == '0') || (number[left] == '8' && number[right]=='8')) {
                check = true;
            }
            left++;
            right--;
        }
        return check;
    }

    public static boolean isPowerOfFour(int n){
        while (n % 4 == 0) {
            n /= 4;
        }
        boolean check = (n == 1) ? true : false;
        return check;
    }

}

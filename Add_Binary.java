package com.HackerRank;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        long number1 = scan.nextInt(); // scan of first number
        while ( number1 != 0) {
            int digit = (int )number1 % 10;
            number1 /= 10;
            if ((digit != 0) && (digit != 1))
                System.out.println("Enter a Correct Binary number ");
        }
        System.out.println("Enter the second number: ");
        int number2 = scan.nextInt(); // scan of second number
        while ( number2 != 0) {
            int digit1 = (int )number2 % 10;
            number2 /= 10;
            if ((digit1 != 0) && (digit1 != 1))
                System.out.println("Enter a Correct Binary number at second place ");
        }
        int[] block = new int[10]; // count the number
        for(int j=block.length -1; j>0 ; j--) {
            int digit1= (int) number1 % 10;
            int digit2= (int) number1 % 10;
            int carry= 0;
            int sum = digit1 + digit2 + carry;
            number1 /=10;
            number2 /=10;
            switch (sum) {
                case 0:{
                    block[j]=0;
                    carry = 0;
                    break;} 
                case 1:{
                    block[j]=1;
                    carry = 0;
                    break;}
                case 2:{
                    block[j]=0;
                    carry = 1;
                    break;}
                case 3:{
                    block[j]=1;
                    carry = 1;
                    break;}
                default:
                    System.out.println("Valid Input"); 
            }
        }
        for(int assign = 0; assign<block.length; assign++ ){
            System.out.println(block[assign]);   // print the array
        }
    }
}
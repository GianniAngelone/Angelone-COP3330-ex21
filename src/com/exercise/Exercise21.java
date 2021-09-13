/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = "Nothing";
        System.out.printf("Please enter the number of the month: ");
        int monthNum = scan.nextInt();
            switch(monthNum) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
                default:
                    System.out.println("You did not enter a proper digit between 1-12");
                    return;
            }
        System.out.printf("The name of the month is %s", month);
    }
}

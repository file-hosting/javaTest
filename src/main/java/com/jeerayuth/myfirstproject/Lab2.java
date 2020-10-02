/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeerayuth.myfirstproject;

import java.util.Scanner;

/**
 *
 * @author jeera
 */
public class Lab2 {
    public static void main (String[] args) {
        for (int i = 1; i < 10; i *= 2){
            System.out.println(i);
        }
        
        double ft, mtr;
        System.out.println("lab 2");
        System.out.println("Enter the length in feet");
        Scanner input = new Scanner(System.in);
        ft = input.nextDouble();
        mtr = ft * 0.305;
        System.out.println(mtr + " meter");
    }
}

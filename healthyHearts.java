package com.sg.summative1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamarjohnson
 */
public class healthyHearts {
    
    public static void main(String[] args) {
        int age;
        
        Scanner heart = new Scanner(System.in);
        System.out.println(" What is you age?");
        age = heart.nextInt();
        int maxHR = 220 - age;
        
        double x = maxHR * 0.5 ;
        int lowHR = (int) x ;
        
        double y = maxHR * 0.85 ;
        int highHR = (int) y ;
        
        System.out.println("Your maximum heart rate should be" +" "+ maxHR +" "+ "beats per minute.");
        System.out.println("The target heart rate zone is between" + " "+ lowHR +" "+ "and"+ " "+highHR+" " +"beats per minute.");
    }
    
}

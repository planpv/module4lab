package com.mycompany.arelements;
/**
 * @author Phillip Plangetis
 * 2/25/22
 * Program: An array of elements
 */
public class Arelements {
    public static void main(String[] args) {
        System.out.println("The Best Scores!");
        int[] counter = {0,0,0,0,0,0,0,0,0,0};
        int[] bonus = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] bestScores = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            System.out.println("\t" +
                    bestScores[i]);
        }
    }
}
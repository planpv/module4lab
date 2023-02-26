package com.mycompany.varlengthargumentslist;
/**
 * @author Phillip Plangetis
 * Date 2/25/23
 * Program Argument List
 */
public class Varlengthargumentslist {
    public static int product(int numbers) {
        int theProduct =  1;
        for (int i: numbers)
            theProduct = theProduct * i;
        return theProduct;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("The product of 1 2 and 3 is: " +
                theProduct(1,2,3));
        System.out.println("The product of 10 and 20 is: " +
                theProduct(10,20));
        System.out.println("The product of 11, 33, 45, and 12 is" 
        + theProduct(11,33,45,12));
        System.out.println(); 
    }
}
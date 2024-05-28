/*
Problem statement
Sam is curious about symmetric patterns, so he decided to create one.

For every value of ‘N’, return the symmetry as shown in the example.

Example:
Input: ‘N’ = 3

Output: 
* * * * * * 
* *     * * 
*         * 
*         * 
* *     * * 
* * * * * * 

*/


public class Solution {

    public static void symmetry(int n) {

        // Write your code here

        for(int i = 0 ; i< n ; i++){

            for(int j = 0 ; j < n-i ; j++){

                    System.out.print("*" + " ");

            }

             for(int j = 0 ; j < i ; j++){

                    System.out.print(" ");

            }

             for(int j = 0 ; j < i ; j++){

                    System.out.print(" ");

            }

            

             for(int j = 0 ; j < n-i ; j++){

                    System.out.print("*" + " ");

 

            }

            System.out.println();

        }

         for(int i = 1 ; i<= n ; i++){

             for(int j = 1 ; j <= i ; j++){

                      System.out.print("*" + " ");

 

            }

             for(int j = 0 ; j < n-i ; j++){

                        System.out.print(" ");

            }

             for(int j = 0 ; j < n-i ; j++){

                      System.out.print(" ");

            }

            

             for(int j = 1 ; j <= i ; j++){

                        System.out.print("*" + " ");

 

            }

            System.out.println();

        }

    }

}


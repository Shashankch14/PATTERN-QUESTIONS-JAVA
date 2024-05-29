/*
Problem statement
Sam is curious about symmetric patterns, so he decided to create one.

For every value of ‘N’, return the symmetry as shown in the example.

Example:
Input: ‘N’ = 3

Output: 
*         *
* *     * *
* * * * * *
* *     * *
*         *
*/



public class Solution {
    public static void symmetry(int n) {
        int space =(2*n)-2;
        for(int i =1;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j =1;j<=stars;j++){
                System.out.print("* ");
            }
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }



            for(int j =1;j<=stars;j++){
                System.out.print("* ");
            }
            if(i<n){
                space-=2;
            }else{
                space+=2;
            }
            //space-=2;
            System.out.println();
            
        }
        // Write your code here
    }
}

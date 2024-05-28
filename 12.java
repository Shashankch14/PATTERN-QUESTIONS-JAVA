/*Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.

Example:
Input: ‘N’ = 3

Output: 

A
A B
A B C

*/
public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        char ap ='A';
        for(int i =0;i<n;i++){
            for(char j ='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
           // ap++;
            System.out.println();
        }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/* Print the following pattern for the given N number of rows.
Pattern for N = 4

The dots represent spaces.
Input format :
Integer N (Total no. of rows)


Output format :
Pattern in N lines


Constraints
0 <= N <= 50


Sample Input 1:
3


Sample Output 1:
     1 
    12
  123
*/
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
            
        
        
    }
}

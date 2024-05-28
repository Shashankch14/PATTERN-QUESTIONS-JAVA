// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/* Pattern for N = 4
4444
333
22
1


Input format :
Integer N (Total no. of rows)


Output format :
Pattern in N lines


Constraints :
0 <= N <= 50


Sample Input 1:
5


Sample Output 1:
55555 
4444
333
22
1

*/
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            // Print the same number 'i' for 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
        
            
        
        
    }
}

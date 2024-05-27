
/*

.Print the following pattern for the given number of rows.
Pattern for N = 5
E
D E
C D E
B C D E
A B C D E


Input format :
N (Total no. of rows)


Output format :
Pattern in N lines


Constraints
0 <= N <= 26


Sample Input 1:
8


Sample Output 1:
H
G H
F G H
E F G H
D E F G H
C D E F G H
B C D E F G H
A B C D E F G H


*/
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
           {
               for(int j=i;j>=0;j--)
                   {
                       System.out.print((char)(65+n-j-1)+" ");
                   }
               System.out.println(); 
           }
            
           
        
    }
}

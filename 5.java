
/*

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
B C
C D E
D E F G


Input format :
Integer N (Total no. of rows)


Output format :
Pattern in N lines


Constraints
0 <= N <= 13


Sample Input 1:
5


Sample Output 1:
A
B C
C D E
D E F G
E F G H I




*/
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i =0;i<n;i++){
            for(int j=i;j<=2*i;j++){
                System.out.print((char)(j+65)+" ");
                
            }
            System.out.println();
           
        }
    }
}

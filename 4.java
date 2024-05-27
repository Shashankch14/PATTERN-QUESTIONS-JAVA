
/*Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC


Input format :
Integer N (Total no. of rows)


Output format :
Pattern in N lines


Constraints
0 <= N <= 26



*/
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char a='A';
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a);
                
            }
            System.out.println();
            a++;
        }
    }
}

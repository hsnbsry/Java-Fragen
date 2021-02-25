package hackerrank;

import java.util.Scanner;

public class Soru0009palindromenumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}
/*
int k=0;
    for(int i=0,j=A.length()-1;i<=j;i++,j--) {

            if(A.charAt(i)!=A.charAt(j))
            {k=1;}

            }

    System.out.println((k==0)?"Yes":"No");
 */
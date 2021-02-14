import java.util.Scanner;

public class Frage00020 {
    public static void main(String[] args) {
        // kullanici sifir girene kadaar sayilari toplayalim

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sy1=scan.nextInt();
        int sum=0;

        do {
            sum=sum+sy1;
            System.out.println("bir sayi giriniz");
            sy1=scan.nextInt()
            ;		}while(sy1!=0);
        System.out.println(sum);
        scan.close();
    }
}

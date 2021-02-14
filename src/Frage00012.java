import java.util.Scanner;

public class Frage00012 {

    public static void main(String[] args) {
        // Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
        //yazdıran bir program yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sy1=scan.nextInt();
        islem(sy1);

        scan.close();
    }

    public static void islem(int sy1) {
        int i=10;
        int y=1;
        int sum=0;
        int ilk=1;
        do {
            ilk=(sy1/y)%i;
            sum=sum+ilk;
            y=y*10;

        }while(sy1>=y);
        System.out.println(sum);
    }
}

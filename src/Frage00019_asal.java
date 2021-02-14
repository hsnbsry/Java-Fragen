import java.util.Scanner;

public class Frage00019_asal {
    public static void main(String[] args) {
        // Asal sayıyı bulan methodu yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scan.nextInt();
        asalSayi(sayi);

        scan.close();
    }
    public static void asalSayi(int sayi) {
        int count=0;
        for(int i=1;i<=sayi;i++) {
            if (sayi%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Asal sayidir.");
        }else {
            System.out.println("Asal sayi degildir");
        }
    }

}

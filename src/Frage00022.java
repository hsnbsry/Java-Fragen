import java.util.Scanner;

public class Frage00022 {

    public static void main(String[] args) {
        // 2. soru   //Girilen sayının tersini return eden java methodunu yazınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String sayi=scan.next();
        tersIslem(sayi);


        scan.close();
    }

    public static void tersIslem(String sayi) {
        int a=sayi.length();
        String ters="";
        while(a!=0) {
            ters+=sayi.charAt(a-1);
            a--;
        }
        System.out.println("Sayinin tersi="+ters);
    }
    //2. yol
//	public static int sayininTersi(int n) {
//		int sonuc=0;
//
//		while(n>0) {
//			int temp = n%10; //123 =>3   ===12 =>2  ==> 1
//			n/=10;//321 /10 =>12  === 12 ==>1 =0
//			sonuc=sonuc*10+temp;//3 == 32  ==> 321
//			}
//		return sonuc;
//	}
}


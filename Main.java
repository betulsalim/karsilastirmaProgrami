import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, sayi, sayi2, enBuyuk = 1, enKucuk = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz.");
        sayi = input.nextInt();

        for (i = 1; i <= sayi; i++) {
            System.out.println(i + ". Sayıyı giriniz:");
            sayi2 = input.nextInt();


            if (i == 1) {
                enKucuk=sayi2;
                enBuyuk=sayi2;

            } else if (i > enBuyuk) {
                enBuyuk=sayi2;
            } else if (i < enKucuk) {
                enKucuk=sayi2;
            }
        }
        System.out.println("En buyuk sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}

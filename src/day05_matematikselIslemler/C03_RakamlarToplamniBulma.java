package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamniBulma {

    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;
        // 1. adim r=0 rt=0 sayi=7532
        rakam=sayi%10; //2      yani ilk birler basamagini bulak icin bunu yapmaliyiz
        rakamlarToplami +=rakam; // 2     bulunan basamaktaki rakami rakamlar toplamina eklemek
        sayi/=10; // 753          toplama ekledigimiz rakamdan kurtulmak icin /10 yapmaliyiz.
        // 2. adim r=2 rt=2 sayi 753
        rakam=sayi%10; // 3
        rakamlarToplami += rakam; // 5
        sayi /=10; // 75
        // 3. adim r=3 rt = 5 sayi=75
        rakam=sayi%10; // 5
        rakamlarToplami += rakam; // 10
        sayi /= 10; // 7
        rakam=sayi%10; // 7
        rakamlarToplami+=rakam; // 17
        sayi/=10; // 7/10=> 0.7     0
        System.out.println("girdiginiz sayinin rakamlar toplami  " + rakamlarToplami);
    }
}















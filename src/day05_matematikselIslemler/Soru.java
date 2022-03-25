package day05_matematikselIslemler;

import java.util.Scanner;

public class Soru {

    public static void main(String[] args) {

        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz

        Scanner scan = new Scanner (System.in);
        System.out.println("4 Basamakli bir tam sayi giriniz");

        int sayi =scan.nextInt();

        int rakam =0;
        int rakamlarTolami=0;

        rakam =sayi%10;
        rakamlarTolami +=sayi;
        sayi/=10;

    }
}

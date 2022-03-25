package day07_ifElseStatements;

import java.util.Scanner;

public class C08_SoruCozumu {

    //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
    //
    //isimlerini yazdirin
    //Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
    //
    //ilkHarf=S output = “Sali”
    //
    //*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("gün isimlerinden birinin ilk harf giriniz");

        String ilkHarf=scan.next().toUpperCase();

        if (ilkHarf.equals("P")) {

            System.out.println("gün Pazar , Pazartesi veya Persembe'dir");
        }
        if (ilkHarf.equals("S")) {
            System.out.println("gün Salidir");
        }
    }
}

package day07_ifElseStatements;

import java.util.Scanner;

public class C09_SoruCozumu2 {

    //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
    //
    //olmadigini yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("dikdörtgenin kenar uzunluklarinin ilkini giriniz");

        int uzunluk1= scan.nextInt();

        System.out.println("dikdörtgenin kenar uzunluklarinin ikincisini giriniz");
        int uzunluk2=scan.nextInt();

        if (uzunluk1==uzunluk2) {

            System.out.println("bu dikdörtgen karedir");
        }else {
            System.out.println("bu dikdörtgendir");
        }

    }
}

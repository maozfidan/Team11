package day07_ifElseStatements;

import java.util.Scanner;

   public class C03_TekCiftSayi {
       //Soru 1) Kullanicidan bir tamsayi isteyin
       // ve sayinin tek veya cift oldugunu yazdirin
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("lütfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift sayidir");
        }
        if (sayi%2!=0){
            System.out.println("girilen sayi tek");
        }
// normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement'da yapmak daha guzel olur
        // ======== if else ile cozum=======
        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }
    }
}

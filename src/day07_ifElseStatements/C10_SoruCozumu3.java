package day07_ifElseStatements;

import java.util.Scanner;

public class C10_SoruCozumu3 {

    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan =new Scanner (System.in);
        System.out.println("lütfen bir gün giriniz");

        String gun=scan.next();

        if (gun.equals("Cuma")) {

            System.out.println("Muslumanlar icin kutsal gun");
        }
        else if (gun.equals("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        else if (gun.equals("Pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }else {
            System.out.println("girilen gun ozel bir gun degildir");
        }

    }
}

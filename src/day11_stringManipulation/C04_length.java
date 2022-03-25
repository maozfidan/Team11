package day11_stringManipulation;

import java.util.Scanner;

public class C04_length {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");

        String isim=scan.nextLine();

        char cumleBasi=isim.toUpperCase().charAt(0);
        char cumleSonu=isim.toUpperCase().charAt(isim.length()-1);
        System.out.println("" + "ilk harf :" + cumleBasi +"\nson harf: " + cumleSonu);

    }
}

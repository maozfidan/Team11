package day10_switch_StringManipulation;

import java.util.Scanner;

public class SoruCozum {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        System.out.println("haftani kacinci günü oldugunu giriniz");
        int gunNo=scan.nextInt();

        switch(gunNo){

            case 1:
                System.out.println("gün pazartesidir");
                break;
            case 2:
                System.out.println("gün salidir");

                break;
            case 3:
                System.out.println("gün carsambadir");
        }

    }
}

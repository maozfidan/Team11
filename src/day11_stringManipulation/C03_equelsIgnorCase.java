package day11_stringManipulation;

import java.util.Scanner;

public class C03_equelsIgnorCase {

    public static void main(String[] args) {


        Scanner scan=new Scanner (System.in);
        System.out.println("derse katilmak istermisiniz");
        String cevap=scan.nextLine();

        if ( cevap.equalsIgnoreCase("evet")) {
            System.out.println("derse katilma alinmistir");
        }else {
            System.out.println("sonraki derslerimize bekleriz");
        }

    }
}

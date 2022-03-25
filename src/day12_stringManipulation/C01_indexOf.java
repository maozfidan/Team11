package day12_stringManipulation;

import java.util.Scanner;

public class C01_indexOf {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Cümle  yazınız");
        String cumle= scan.nextLine();
        System.out.println("bir kelime yazınız ");
        String kelime=scan.nextLine();

        int ilkKullanım=cumle.indexOf(kelime);
        int ikinciKullanım=cumle.indexOf(kelime,ilkKullanım+1);

        if (ilkKullanım==(-1)){
            System.out.println("kullanılmamış");
        }else if(ikinciKullanım==(-1)){
            System.out.println("bir defa kullanılmış");}
        else {
            System.out.println("birden fazla kullanılmış");
        }
    }
}

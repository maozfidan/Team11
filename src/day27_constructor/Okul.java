package day27_constructor;

import java.util.Scanner;

public class Okul {

    String okulIsmi = "Yildiz kolleji";
    boolean gercekMi = true;

    int okulYili = 2021;
    int sinifSayisi;
    int okulKapasitesi;
    int ögretmenSayisi;

    boolean ilkOkul=false;
    boolean ortaOkul=false;

    public void ogrenciKayitBilgileri() {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 6) {


            System.out.println("agam okulumuzda kres yoktur:)");


        } else if (yas < 10) {
            ilkOkul=true;
            System.out.println("kaydinizi ilkokula yaptirabilirsiniz");
            System.out.println("ogretmeninizin ismi :"+ "Adem Tatli");

        } else if (yas < 15) {
            ortaOkul=true;
            System.out.println("ortaokula gidebilirsnin");

            System.out.println("ogretmeninizin ismi :"+"Aydin C.");
        }


    }

       public void dersler() {

            if (ilkOkul==true){

                System.out.println("ilkokul dersleri: Matematik ,Hayat bilgisi , resim , beden egitimi ");
            }if (ortaOkul==true){

               System.out.println("ortaokul dersleri : fizik , kimya , biyoloji, matematik");
           }


        }
}

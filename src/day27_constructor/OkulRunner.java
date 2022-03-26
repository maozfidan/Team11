package day27_constructor;

public class OkulRunner {

    public static void main(String[] args) {

        Okul o1= new Okul();

        System.out.print("o1 yil :"+o1.okulYili + " , okul ismi :" +o1.okulIsmi + " ,sinif sayisi : "+ o1.sinifSayisi);

        o1.sinifSayisi=20;
        o1.okulKapasitesi=500;
        System.out.println("\nsinif sayisi: "+o1.sinifSayisi + ",\nokul kapasitesi: "+ o1.okulKapasitesi);

        o1.ogrenciKayitBilgileri();

        o1.dersler();



    }


}

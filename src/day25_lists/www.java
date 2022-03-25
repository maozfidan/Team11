package day25_lists;

import java.util.Arrays;

public class www {


    public static void main(String[] args) {

        String kelime[]={"Fatma","Mehmet","Ahmet"};

        String Kelime2[]={"Asli","Mehmet","Ahmet"};

      kelime[0]="Asli";

      Arrays.sort(kelime);
      Arrays.sort(Kelime2);

        System.out.println(Arrays.equals(kelime,Kelime2));

        System.out.println(Arrays.binarySearch(kelime,"Fatma"));
        System.out.println(kelime.length);

        System.out.println(Arrays.toString(kelime));
    }
}

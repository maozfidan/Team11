package day24_lists;

import java.util.*;

public class aa {

    //1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

    public static void main(String[] args) {

        List<String> hafrler=new ArrayList<>();

        hafrler.add("A");
        hafrler.add("C");
        hafrler.add("E");
        hafrler.add("F");
        hafrler.add("B");
        hafrler.add(1,"L");

        System.out.println(hafrler);

        Collections.sort(hafrler);

    }
}

package hatirlama;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lesson1 {


    public static void main(String[] args) {

        List<String> mylist=new LinkedList<>();

        mylist.add("ali");
        mylist.add("yunus");

        Map<Integer,String> myMap=new HashMap<>();
        Map<Long,String> calisanlar=new HashMap<>();

       calisanlar.put(101l,"veli");
       calisanlar.put(101l,"ali");

        System.out.println(calisanlar.keySet());
        System.out.println(calisanlar.values());

        System.out.println(calisanlar.get(101));

        System.out.println(calisanlar.containsKey(1));
        System.out.println(calisanlar.containsKey("veli"));



    }
}

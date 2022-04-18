package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {

    public static void main(String[] args) {


        Deque<Integer> ll1 = new LinkedList<>();

        System.out.println(ll1.poll());

        System.out.println(ll1.pop());
    }
}

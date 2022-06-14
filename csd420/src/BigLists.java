// Scott Shannon                        Module 4 assignment                     13 June 2022

/*
 The purpose of this code was to store 50,000 integers in a LinkedList and traverse them using an iterator approach
 as well as the get(index) method. Compare the time of each test, and choose the fastest method for a 500,000 integer
 LinkedList. I chose to use the iterator approach as it was 10x faster than the .get() in my test.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class BigLists {
    public static void main(String[] arg) {
        //A test program that stores 50,000 integers in LinkedList
        LinkedList<Integer> numberLinkedList = new LinkedList<>();

        int i;
        // add 50000 integers to LinkedList
        for (i = 0; i < 50000; i++) {
            numberLinkedList.add(i);
        }

        long startTime;
        long endTime;

        startTime = System.nanoTime();

        //test the time to traverse the list using an iterator
        for (i = 0; i < numberLinkedList.size(); i++) {
            numberLinkedList.get(i);
        }

        endTime = System.nanoTime();

        //.get() took 1098.087816 milliseconds
        System.out.println(".get() took " + ((double) (endTime - startTime) / 1000000) + " milliseconds");

        Iterator<Integer> listIterator = numberLinkedList.iterator();

        startTime = System.nanoTime();

        //test the time to traverse the list using the get(index) method
        while (listIterator.hasNext()) {
            listIterator.next();
        }

        endTime = System.nanoTime();

        //iterator took 1.325375milliseconds
        System.out.println("iterator took " + ((double) (endTime - startTime) / 1000000) + " milliseconds");

        LinkedList<Integer> halfAMilliLinkedList = new LinkedList<>();

        for (i = 0; i < 500000; i++) {
            halfAMilliLinkedList.add(i);
        }

        Iterator<Integer> halfAMilliIterator = halfAMilliLinkedList.iterator();

        startTime = System.nanoTime();

        while (halfAMilliIterator.hasNext()) {
            halfAMilliIterator.next();
        }

        endTime = System.nanoTime();

        //500,000 iterator took 9.607643milliseconds
        System.out.println(" final iterator took " + ((double) (endTime - startTime) / 1000000) + " milliseconds");
    }
}


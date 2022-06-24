// Scott Shannon                Module 6 Assignment             23 June 2022
// The purpose of this code is to use the two generic methods provided on bubble sort

import java.util.Arrays;
import java.util.Comparator;

public class Torable {

    public static void main(String[] args) {
        Integer[] list = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] listTwo = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        //line break
        System.out.println();

        System.out.println("Comparator bubble sort:");
        bubbleSort(list, (i1, i2) -> i1 - i2);

        //line break
        System.out.println();

        System.out.println("Comparable bubble sort:");
        bubbleSort(listTwo);
    }

    public static <E extends Comparable<E>>
    void bubbleSort(E[] list) {

        //temp is used for swapping
        E temp;

        //print array to show no sorting yet
        System.out.println(Arrays.toString(list));

        //i starting at 0
        for (int i = 0; i < list.length - 1; i++) {

            //j starting at 0
            for (int j = 0; j < list.length - 1; j++) {

                // if list[0] > list[1] then swamp
                if (list[j].compareTo(list[j + 1]) > 0) {

                    //temp = list[0]
                    temp = list[j];

                    //list[0] = list[1]
                    list[j] = list[j + 1];

                    //list[1] = temp or list[0]
                    list[j + 1] = temp;
                }
            }
            // print array after swap
            System.out.println(Arrays.toString(list));
        }
        if (list.length - 1 != 9){
            System.out.println("oopsie woopsie");
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        //temp is used for swapping
        E temp;

        //print array to show no sorting yet
        System.out.println(Arrays.toString(list));

        //i starting at 0
        for (int i = 0; i < list.length - 1; i++) {

            //j starting at 0
            for (int j = 0; j < list.length - 1; j++) {

                // if list[0] > list[1] then swamp
                if (comparator.compare(list[j], list[j + 1]) > 0) {

                    //temp = list[0]
                    temp = list[j];

                    //list[0] = list[1]
                    list[j] = list[j + 1];

                    //list[1] = temp or list[0]
                    list[j + 1] = temp;
                }
            }
            // print array after swap
            System.out.println(Arrays.toString(list));
        }
        if (list.length - 10 != 0){
            System.out.println("oopsie woopsie");
        }
    }
}
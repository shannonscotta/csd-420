//scott shannon             CSD 420 Module 3 Assignment             1 JUNE 2022
// The purpose of this code is to write a method that returns a new Arraylist without duplicates from a random ArrayList

import java.util.*;

public class ArrayListTester {

    public static void main(String[] args) {
        final int LOWER_BOUND_INT = 1;
        final int UPPER_BOUND_INT = 20;
        final int ARR_LIS_SIZE = 50;

        Random random = new Random();

        ArrayList<Integer> originalArrayList = new ArrayList(ARR_LIS_SIZE);

        int i;
        for (i = 0; i < ARR_LIS_SIZE; i++) {
            originalArrayList.add(random.nextInt(UPPER_BOUND_INT - LOWER_BOUND_INT) + LOWER_BOUND_INT);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("ORIGINAL ARRAY LIST: " + originalArrayList);
        System.out.println("");
        System.out.println("");
        System.out.println("NEW ARRAY LIST: " + removeDuplicates(originalArrayList));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

        ArrayList<Integer> newArrayList = new ArrayList(20);

        for (Integer integer : list) {
            if (!newArrayList.contains(integer)) {
                newArrayList.add(integer);
            }
        }
        return newArrayList;
    }
}
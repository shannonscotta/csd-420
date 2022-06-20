// Scott Shannon                    Mod 5 Assignment                    19 June 2022
/*
write a program that reads words from a text file, displays all non-duplicates and then displays them in ascending and
descending order
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ReadFromFileModFive {

    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(new File("collection_of_words.txt"));

            // set contains no duplicates
            HashSet<String> set = new HashSet<String>();

            // read in file
            while (input.hasNext()) {
                String token = input.next();
                set.add(token);
            }

            // create List from set
            ArrayList<String> list = new ArrayList<String>(set);

            System.out.println("Ascending: ");

            // sort list
            Collections.sort(list);
            System.out.println(list);

            System.out.println();

            System.out.println("Descending: ");
            // reverse list
            Collections.reverse(list);
            System.out.println(list);

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
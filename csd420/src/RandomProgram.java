////scott shannon             CSD 420 Module 1 Assignment             28 May 2022
//// The purpose of this code is to write a program that stores random arrays, and an instance of the current date,
//// write the data to a file, and then read that data and then test out the program
//
//import java.io.*;
//import java.util.*;
//
//public class RandomProgram {
//    public static void main (String[] args) throws IOException {
//        final int LOWER_BOUND_INT = 1;
//        final int UPPER_BOUND_INT = 10;
//        final int ARR_SIZE_INT = 5;
//
//
//        int numerator;
//        int denominator = numerator + 1;
//
//        final double LOWER_BOUND_DOUBLE = 1.0;
//        final double UPPER_BOUND_DOUBLE = 10.0;
//        final int ARR_SIZE_DOUBLE = 5;
//
//        Random random = new Random();
//
//        int[] randomIntArr = new int[ARR_SIZE_INT];
//
//        for (int i = 0; i < ARR_SIZE_INT; i++) {
//            randomIntArr[i] = random.nextInt(UPPER_BOUND_INT - LOWER_BOUND_INT) + LOWER_BOUND_INT;
//        }
//
//        String completeIntArr = "The complete random array of integers is: " + Arrays.toString(randomIntArr);
//        //System.out.println(completeIntArr);
//
//        double[] randomDoubleArr = new double[ARR_SIZE_DOUBLE];
//
//        for (int i = 0; i < ARR_SIZE_DOUBLE; i++) {
//            randomDoubleArr[i] = random.nextDouble() * (UPPER_BOUND_DOUBLE - LOWER_BOUND_DOUBLE) + LOWER_BOUND_DOUBLE;
//        }
//
//        String completeDoubleArr = "The complete random array of double's is: " + Arrays.toString(randomDoubleArr);
//        //System.out.println(completeDoubleArr);
//
//        Date currentDate = new Date();
//        String stringDate = "The current date is : " + currentDate.toString();
//        //System.out.println(stringDate);
//
//        PrintWriter writeFile = new PrintWriter("scott_datafile.dat");
//
//        writeFile.println();
//        writeFile.write(stringDate);
//        writeFile.println();
//        writeFile.write(completeIntArr);
//        writeFile.println();
//        writeFile.write(completeDoubleArr);
//        writeFile.println();
//        writeFile.println();
//
//        writeFile.close();
//
//        FileReader readFile = new FileReader("scott_datafile.dat");
//
//        int i;
//
//        while((i=readFile.read())!=-1)
//            System.out.print((char)i);
//        readFile.close();
//
//        System.out.println(readFile);
//    }
//}
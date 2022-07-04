// Scott Shannon                    CSD-420 Module 8 Assignment                 3 July 2022
// The purpose of this code is the use a different thread to output 10,000 random letters, numbers, and characters

package Module8;

import java.util.Random;

public class ScottThreeThreads {
    public static void main(String[] args) {
        //create thread instances
        RandomLetter thread1 = new RandomLetter();
        RandomNumber thread2 = new RandomNumber();
        RandomCharacter thread3 = new RandomCharacter();

        //start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//In the first thread, you are to output random letter characters such as a, b, c, d …
class RandomLetter extends Thread {
    String[] arrayOfLetters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public void run() {
        int i = 0;
        while (i < 10000) {
            int rnd = new Random().nextInt(arrayOfLetters.length);
            System.out.println("Thread1: " + arrayOfLetters[rnd]);
            i++;
        }
    }
}

//In the second thread, you are to output random number digits such as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
class RandomNumber extends Thread {
    int[] arrayOfNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void run() {
        int i = 0;
        while (i < 10000) {
            int rnd = new Random().nextInt(arrayOfNumbers.length);
            System.out.println("Thread2: " + arrayOfNumbers[rnd]);
            i++;
        }
    }
}

//In the third thread, you are to output random characters such as !, @, #, $, %, &, *
class RandomCharacter extends Thread {
    char[] arrayOfCharacters = {'!', '@', '#', '$', '%', '&', '*'};

    public void run() {
        int i = 0;
        while (i < 10000) {
            int rnd = new Random().nextInt(arrayOfCharacters.length);
            System.out.println("Thread3: " + arrayOfCharacters[rnd]);
            i++;
        }
    }
}
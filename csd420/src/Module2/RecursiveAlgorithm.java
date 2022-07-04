package Module2;//scott shannon             CSD 420 Module 2 Assignment             29 May 2022
/*
The purpose of this code is to create a program that uses recursion to return the sum of ...
m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1) and then test it to make sure that it works
 */

public class RecursiveAlgorithm {

    public static void main(String[] args) {

        System.out.println("myMethod(4) : " + myMethod(4));
        System.out.println("myMethod(9) : " + myMethod(9));
        System.out.println("myMethod(14) : " + myMethod(14));
    }

    public static double myMethod(int i) {

        // stops infinite loop
        if (i == 0) {
            return 0;
        }

        // cast to double and return recursively
        return i / (double) (i + 1) + myMethod(i - 1);
    }

}

/*
myMethod(4) : 2.716666666666667
myMethod(9) : 7.071031746031746
myMethod(14) : 11.681771006771008
*/

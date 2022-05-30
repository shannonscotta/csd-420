import java.io.FileInputStream;

public class ReadTester {

    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("WriteTester.txt");

            System.out.println("I read this from the file you specified: ");

            // Reads the first byte
            int i = input.read();

            while (i != -1) {
                //prints each
                System.out.print((char) i);

                // Reads the next byte from the file
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
import java.io.FileOutputStream;

public class WriteTester {
    public static void main(String[] args) {

        String someData = "This class should write this to a new file named WriteTester.txt";

        try {
            FileOutputStream writtenFile = new FileOutputStream("WriteTester.txt");

            byte[] array = someData.getBytes();

            // This writes bytes to a file
            writtenFile.write(array);

            // close fileoutputstream
            writtenFile.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}


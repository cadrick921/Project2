import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("C:\\Users\\cadri\\OneDrive\\바탕 화면\\해야할일.txt");
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
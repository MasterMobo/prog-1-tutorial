package week6;

import java.io.*;
import java.util.StringTokenizer;

public class ReadStudent {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("students.obj")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj;
            while (true) {
                obj = ois.readObject();
                if (obj == null) break;

                System.out.println(obj);
            }
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

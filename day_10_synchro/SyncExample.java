package day_10_synchro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileRead {
    void display(String n) {
        try {
            int d;
            FileReader r = new FileReader(n);
            while ((d = r.read()) != -1) {
                System.out.print((char)d);
                Thread.sleep(1000);
            }
            r.close(); // Close the file reader
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + n);
        } catch (IOException d) {
            System.out.println("I/O error occurred.");
        } catch (InterruptedException o) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class SyncExample {
    public static void main(String[] args) {
        FileRead f = new FileRead();
        f.display("hellow.txt");
    }
}


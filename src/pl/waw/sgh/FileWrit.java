package pl.waw.sgh;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWrit {
    static final String FILE_LOC = "..\\..\\myfile.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_LOC);
        // append existing file or not
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
        bw.newLine();
        bw.write("2nd line ...\n 3rd line\n4th line\tAfter tab");
        bw.close();
        fw.close();

        System.out.println(System.getProperties());
    }
}
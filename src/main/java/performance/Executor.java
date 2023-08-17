package performance;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Executor {

    public static void writingDataFile(String filename, long nb) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
        for (int i = 0; i < nb; i++) {
            bw.write(String.valueOf((long) (Math.random() * nb)));
            bw.newLine();
        }
        bw.close();
    }

    public static long readingDataFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        long nb = 0;
        String line;
        while ((line = br.readLine()) != null) {
            nb++;
        }
        br.close();
        return nb;
    }

    public static void readLinkedList(LinkedList list) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static void readArrayList(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }

    public static void readArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            long test = array[i];
        }
    }
}

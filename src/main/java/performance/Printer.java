package performance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
    public static final String path = "src/main/java/performance/reports/";

    public static String printSeparator() {
        return "----------------------------------------";
    }

    private static void createReport(String toWrite) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path + "report.txt"), true));
        if (new File(path + "report.txt").length() != 0) {
            bw.newLine();
        }
        bw.write(toWrite);
        bw.close();
    }

    public static void printTime(long startTime, long endTime, String method) {
        String toWrite = "";
        toWrite += printSeparator() + "\n";
        toWrite += "Method: " + method + "\n";
        toWrite += "Time: " + (endTime - startTime) + " ms\n";
        toWrite += printSeparator() + "\n";
        try {
            createReport(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printTime(long startTime, long endTime, String method, long nb) {
        String toWrite = "";
        toWrite += printSeparator() + "\n";
        toWrite += "Method: " + method + "\n";
        toWrite += "Number of lines: " + nb + "\n";
        toWrite += "Time: " + (endTime - startTime) + " ms\n";
        toWrite += printSeparator() + "\n";
        try {
            createReport(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

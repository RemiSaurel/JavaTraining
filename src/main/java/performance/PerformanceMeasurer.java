package performance;

import java.io.IOException;
import java.util.ArrayList;

public class PerformanceMeasurer {
    private static final String path = "src/main/java/performance/data/";

    public PerformanceMeasurer() {
    }

    public void writingPerformance(String filename, long nb) throws IOException {
        long startTime = System.currentTimeMillis();
        Executor.writingDataFile(path + filename, nb);
        long endTime = System.currentTimeMillis();
        Printer.printTime(startTime, endTime, "writing", nb);
    }

    public void readingPerformance(String filename) throws IOException {
        long startTime = System.currentTimeMillis();
        long nbLines = Executor.readingDataFile(path + filename);
        long endTime = System.currentTimeMillis();
        Printer.printTime(startTime, endTime, "reading", nbLines);
    }

    public void readArrayListPerformance(ArrayList<Long> arrayList) {
        long startTime = System.currentTimeMillis();
        Executor.readArrayList(arrayList);
        long endTime = System.currentTimeMillis();
        Printer.printTime(startTime, endTime, "reading array list", arrayList.size());
    }

    public void readArrayPerformance(long[] array) {
        long startTime = System.currentTimeMillis();
        Executor.readArray(array);
        long endTime = System.currentTimeMillis();
        Printer.printTime(startTime, endTime, "reading array", array.length);
    }
}

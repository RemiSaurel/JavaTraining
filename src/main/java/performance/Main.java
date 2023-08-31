package performance;

public class Main {

    private final static long[] sizes = {1000, 1000000, 10000000};

    public static void main(String[] args) {
        PerformanceMeasurer performanceMeasurer = new PerformanceMeasurer();
        try {
            for (long size : sizes) {
                performanceMeasurer.writingPerformance("data_" + size + ".txt", size);
                performanceMeasurer.readingPerformance("data_" + size + ".txt");
                performanceMeasurer.readArrayListPerformance(DataStructureCreator.createArrayList(size));
                performanceMeasurer.readArrayPerformance(DataStructureCreator.createArray(size));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package performance;

import java.util.ArrayList;

public class DataStructureCreator {

    public static ArrayList<Long> createArrayList(long size) {
        System.out.println("Creating array list of size " + size);
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((long) (Math.random() * size));
        }
        return list;
    }

    public static long[] createArray(long size) {
        System.out.println("Creating array of size " + size);
        long[] array = new long[(int) size];
        for (int i = 0; i < size; i++) {
            array[i] = (long) (Math.random() * size);
        }
        return array;
    }
}

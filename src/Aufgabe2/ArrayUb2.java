package Aufgabe2;
import java.util.List;
import java.util.ArrayList;

public class ArrayUb2 {

    public List<Integer> positiv = new ArrayList<>();

    int max = 0;

    public int maximal() {
        for (Integer i : positiv) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }



    public int minimal() {
        int min = positiv.getFirst();
        for (Integer i : positiv) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int maxsum() {
        List<Integer> maxsum = new ArrayList<>();
        for (Integer i : positiv) {
            if (i != minimal()) {
                maxsum.add(i);
            }
        }
        int sum = 0;
        for (Integer i : maxsum) {
            sum += i;
        }
        return sum;
    }

    public int minsum() {
        List<Integer> minsum = new ArrayList<>();
        for (Integer i : positiv) {
            if (i != max) {
                minsum.add(i);
            }
        }
        int sum = 0;
        for (Integer i : minsum) {
            sum += i;
        }
        return sum;
    }

}


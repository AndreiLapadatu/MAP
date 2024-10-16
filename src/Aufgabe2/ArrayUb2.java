package Aufgabe2;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayUb2 {


    int max = 0;

    public int maximal(int[] positiv) {
        for (Integer i : positiv) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }



    public int minimal(int[] positiv) {
        int min = Arrays.stream(positiv).findFirst().getAsInt();
        for (Integer i : positiv) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int maxsum(int[] positiv) {
        //List<Integer> maxsum = new ArrayList<>();
        int [] maxsum = new int[positiv.length];
        int index = 0;
        for (Integer i : positiv) {
            if (i != minimal(positiv)) {
                maxsum[index++] = i;
            }
        }
        int sum = 0;
        for (Integer i : maxsum) {
            sum += i;
        }
        return sum;
    }

    public int minsum(int[] positiv) {
        int[] minsum = new int[positiv.length];
        int index = 0;
        for (Integer i : positiv) {
            if (i != max) {
                minsum[index++] = i;
            }
        }
        int sum = 0;
        for (Integer i : minsum) {
            sum += i;
        }
        return sum;
    }

}


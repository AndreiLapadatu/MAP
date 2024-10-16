package Aufgabe1;
import java.util.ArrayList;
import java.util.List;

public class Uni {



    public int[] NichtAusreichender(int[]notenArray) {
        int[]nicht_reichender = new int[notenArray.length];
        int index = 0;
        for (Integer integer : notenArray) {
            if (integer < 40) {
                nicht_reichender[index++] = integer;
            }
        }
        return nicht_reichender;
    }


    public double Sum(int[]notenArray) {
        double sum = 0;
        for (Integer integer : notenArray) {
            sum += integer;
        }
        return sum;
    }


    public float Durschschnitt(int []notenArray) {

        double sum = Sum(notenArray);
        float durchschnitt = (float) (sum / notenArray.length);
        return durchschnitt;
    }



    public int[] Abrundung(int []notenArray){
        int[] rundenArray = new int [notenArray.length];
        int index = 0;
        for(int integer : notenArray){
            if(integer < 38){
                rundenArray[index++] = integer;
            }else if(integer%10 == 3 || integer%10 == 8){
                 rundenArray[index++] = integer + 2;
            } else if (integer%10 == 4 || integer%10 == 9) {
                rundenArray[index++] = integer + 1;
            }else{rundenArray[index++] = integer;}

        }
    return rundenArray;
    }

    public int max_nach_runden(int[] notenArray){
        int max = 0;
        int[] rundenArray = Abrundung(notenArray);
        for(Integer integer : rundenArray){
            if(integer > max){
                max = integer;
            }
        }
    return max;
    }
}





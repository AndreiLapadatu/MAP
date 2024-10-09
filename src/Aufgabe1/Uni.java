package Aufgabe1;
import java.util.ArrayList;
import java.util.List;

public class Uni {

    public List<Integer> notenArray = new ArrayList<>();
    public List<Integer> nicht_reichend = new ArrayList<>();


    public List<Integer> NichtAusreichender() {

        for (Integer integer : notenArray) {
            if (integer < 40) {
                nicht_reichend.add(integer);
            }
        }
        return nicht_reichend;
    }


    public double Sum() {
        double sum = 0;
        for (Integer integer : notenArray) {
            sum += integer;
        }
        return sum;
    }


    public float Durschschnitt() {

        double sum = Sum();
        float durchschnitt = (float) (sum / notenArray.size());
        return durchschnitt;
    }

    List<Integer>rundenArray = new ArrayList<>();

    public List<Integer> Abrundung(){
        for(Integer integer : notenArray){
            if(integer < 38){
                rundenArray.add(integer);
            }else if(integer%10 == 3 || integer%10 == 8){
                 rundenArray.add(integer+2);
            } else if (integer%10 == 4 || integer%10 == 9) {
                rundenArray.add(integer+1);
            }else{rundenArray.add(integer);}

        }
    return rundenArray;
    }

    public int max_nach_runden(){
        int max = 0;
        for(Integer integer : rundenArray){
            if(integer > max){
                max = integer;
            }
        }
    return max;
    }
}





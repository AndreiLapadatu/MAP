package Aufgabe4;
import java.util.List;
import java.util.ArrayList;
public class electroShop {

    public List<Integer>Tastatur = new ArrayList<>();
    public List<Integer>USB = new ArrayList<>();

    public int billig(){
        int min = Tastatur.getFirst();
        for(Integer i : Tastatur){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int am_teuersten(){
        int max1 = 0;
        for(Integer i : Tastatur){
            if(i > max1){
                max1 = i;
            }
        }
        int max2 = 0;
        for(Integer i : USB){
            if(i > max2){
                max2 = i;
            }
        }
        if(max1 > max2){
            return max1;
        }else {return max2;}
    }


    public int buget(){
        int money = 30;
        List<Integer>affordable = new ArrayList<>();
        for(Integer i : USB){
            if(i <= money){
                affordable.add(i);

            }
        }
        int max = 0;
        for(Integer i : affordable){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public int max_basket() {
        int buget = 60;
        List<Integer>basket = new ArrayList<>();
        for (Integer i : USB) {
            for(Integer j : Tastatur){
                if(i + j <= buget){
                    basket.add(i + j);
                }
            }
        }
        int max = 0;
        for(Integer i : basket){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}

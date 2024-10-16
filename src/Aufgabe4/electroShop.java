package Aufgabe4;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class electroShop {

    //public List<Integer>Tastatur = new ArrayList<>();
    //public List<Integer>USB = new ArrayList<>();

    public int billig(int[]tastatur){
        int min = Arrays.stream(tastatur).findFirst().getAsInt();
        for(Integer i : tastatur){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int am_teuersten(int[]tastatur, int[]usb){
        int max1 = 0;
        for(Integer i : tastatur){
            if(i > max1){
                max1 = i;
            }
        }
        int max2 = 0;
        for(Integer i : usb){
            if(i > max2){
                max2 = i;
            }
        }
        if(max1 > max2){
            return max1;
        }else {return max2;}
    }


    public int buget(int money,int []usb){
        //int money = 30;
        int [] affordable = new int [usb.length];
        int index = 0;
        for(Integer i : usb){
            if(i <= money){
                affordable[index] = i;
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

    public int max_basket(int buget,int[]tastatur, int[]usb) {
        //int buget = 60;
        int []basket = new int [usb.length];
        int index = 0;
        for (Integer i : usb) {
            for(Integer j : tastatur){
                if(i + j <= buget){
                    basket[index] = i+j;
                }
            }
            index++;
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

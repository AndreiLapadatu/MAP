import Aufgabe1.Uni;
import Aufgabe2.ArrayUb2;
import Aufgabe3.grossZahlAlsArray;
import Aufgabe4.electroShop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Uni uni = new Uni();
        int[] noten = {55, 66, 33, 42, 53, 20, 98};
        System.out.println("Nicht reichend:"+ Arrays.toString(uni.NichtAusreichender(noten)));
        System.out.println(String.format("Durchschnitt: %.2f", uni.Durschschnitt(noten)));
        System.out.println("abgerundete Noten: "+ Arrays.toString(uni.Abrundung(noten)));
        System.out.println("grosste Note nach Rundung: "+uni.max_nach_runden(noten));

        ArrayUb2 arr2 = new ArrayUb2();
        int [] arr_ub2 = {2,5,12};
        System.out.println("maxim: "+arr2.maximal(arr_ub2));
        System.out.println("minim: "+arr2.minimal(arr_ub2));
        System.out.println("Summe ohne kleinste: "+arr2.maxsum(arr_ub2));
        System.out.println("Sumee ohne grosste: "+arr2.minsum(arr_ub2));

        grossZahlAlsArray grossarr = new grossZahlAlsArray();
        System.out.println("Addition: "+grossarr.addition());
        System.out.println("Subtraction: "+grossarr.subtraction());
        System.out.println("Multiplikation: "+grossarr.multiplication());
        System.out.println("Division: "+grossarr.division());

        electroShop shop = new electroShop();
        int [] arr4 = {5,10,15};
        int [] arr44 = {15,20,35};
        System.out.println("billigste Tastatur:"+shop.billig(arr4));
        System.out.println("Teuersten Objket aus Shop: "+shop.am_teuersten(arr4,arr44));
        System.out.println("USB Shop im fk von Markus buget: "+shop.buget(30,arr44));
        System.out.println("Teuersten Einkaufskorb im fk von Markus buget: "+shop.max_basket(60,arr4,arr44));


    }
}

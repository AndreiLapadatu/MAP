import Aufgabe1.Uni;
import Aufgabe2.ArrayUb2;
import Aufgabe3.grossZahlAlsArray;
import Aufgabe4.electroShop;

public class Main {
    public static void main(String[] args) {
        Uni uni = new Uni();
        uni.notenArray.add(55);
        uni.notenArray.add(66);
        uni.notenArray.add(33);
        uni.notenArray.add(42);
        uni.notenArray.add(53);
        System.out.println(uni.NichtAusreichender());
        System.out.println(String.format("Result: %.2f", uni.Durschschnitt()));
        System.out.println(uni.Abrundung());
        System.out.println(uni.max_nach_runden());

        ArrayUb2 arr2 = new ArrayUb2();
        arr2.positiv.add(12);
        arr2.positiv.add(2);
        arr2.positiv.add(5);
        System.out.println(arr2.maximal());
        System.out.println(arr2.minimal());
        System.out.println(arr2.maxsum());
        System.out.println(arr2.minsum());

        grossZahlAlsArray grossarr = new grossZahlAlsArray();
        System.out.println(grossarr.addition());
        System.out.println(grossarr.subtraction());
        System.out.println(grossarr.multiplication());
        System.out.println(grossarr.division());

        electroShop shop = new electroShop();
        shop.Tastatur.add(15);
        shop.Tastatur.add(20);
        shop.Tastatur.add(35);
        shop.USB.add(15);
        shop.USB.add(20);
        shop.USB.add(40);
        System.out.println(shop.billig());
        System.out.println(shop.am_teuersten());
        System.out.println(shop.buget());
        System.out.println(shop.max_basket());


    }
}

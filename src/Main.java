import Aufgabe1.Uni;
import Aufgabe2.ArrayUb2;


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
    }
}

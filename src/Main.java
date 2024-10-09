import Aufgabe1.Uni;


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

    }
}
package Aufgabe3;

public class grossZahlAlsArray {

    int[] array1 = {1300000};
    int[] array2 = {8700000};

    public int addition(){
        int addieren =  array1[0] + array2[0];
        return addieren;
    }

    public int subtraction(){
        int subtraction = array2[0] - array1[0];
        return subtraction;
    }

    public int multiplication(){
        int multiplication = array1[0] * 2;
        return multiplication;
    }

    public int division(){
        int division = array1[0] / 2;
        return division;
    }
}

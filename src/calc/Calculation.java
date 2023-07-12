package src.calc;

public class Calculation {
    protected static int plus (int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    protected static int minus (int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    protected static int ymn (int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    protected static int del (int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }
    protected static int fact (int numberOne){
        int res = 1;
        for (int i = 1; i < numberOne; i++){
            res *= i;
        }
        return res;
    }
}
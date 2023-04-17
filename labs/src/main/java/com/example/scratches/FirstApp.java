package com.example.scratches;

public class FirstApp {
    public static void main(String[] args) {
        double result = 2.25*2*5;
        System.out.println(result);


        Sport sport = new Sport();
        sport.showResult(2.25);

    }
}

class Sport {

    double result1;
    Double result2;

    Long sum = 0L;

    public Sport() { }

    void showResult(Number time) {
        String result = Double.toString(2 * (Double) time);
        Double result2 = Double.valueOf(result)*5;
        System.out.println(result2 + " USD");
    }

    private String calculateResult(Double time) {
        return Double.toString(2*time);
    }

    Long calculateSum(Long a, Long b) {
        sum = sum + a;
        return sum + b;
    }

}
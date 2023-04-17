package com.example.labs.AppPositionChange;

public class AppPositionChange {


    public static void main(String[] args) {

        Numbers numbers1 = new Numbers(15, 57);
        numbers1.changePositionWithTmp();

        Numbers numbers2 = new Numbers(15, 57);
        numbers2.changePositionWithoutTmp();
    }
}

class Numbers {
    int a;
    int b;

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void changePositionWithTmp() {
        System.out.println("Sposób 1 z dodatkową zmienną:");
        System.out.println("Before changing position: a = " + this.a + ", b = " + this.b);
        int tmp = this.a;
        this.a = this.b;
        this.b = tmp;
        System.out.println("After changing position: a = " + this.a + ", b = " + this.b);
    }

    public void changePositionWithoutTmp() {
        System.out.println("Sposób 2 bez dodatkowej zmiennej:");
        System.out.println("Before changing position: a = " + this.a + ", b = " + this.b);
        this.a += this.b;  // wynik (A=a) => (A) a+b
        this.b = this.a - this.b; // wynik (B=b) => (a+b)-b = a
        this.a -= this.b; // wynik (A) => (a+b)-a = b
        System.out.println("After changing position: a = " + this.a + ", b = " + this.b);
    }
}


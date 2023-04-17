package com.example;

public class GoodPractices {

//    Class should begin with a list of variables
    public static String PUBLIC_ATRIBUTE = "Jakaś stała nazwa";
    protected static String PROTECTED_ATRIBUTE = "Jakaś stała nazwa";
    private static String PRIVATE_ATRIBUTE = "Jakaś stała nazwa";

    public int age;
    protected int age2;
    private int age3;

    public GoodPractices(){};

    public GoodPractices(int age, int age2, int age3) {
        this.age = age;
        this.age2 = age2;
        this.age3 = age3;
    }

    public void publicMethod() {}
    protected void protectedMethod() {}
    private void privateMethod() {}

    private void privateInnerMethod() {}

}

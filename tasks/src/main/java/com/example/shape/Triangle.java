package com.example.shape;

public class Triangle implements Shape {

    private final static String name = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        return Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        if(checkTriangleCondition()){
            return Math.sqrt(getHalfOfCircuit()*(getHalfOfCircuit() - sideA)*(getHalfOfCircuit() - sideB)*(getHalfOfCircuit() - sideC));
        } else {
            return 0;
        }
    }

    private boolean checkTriangleCondition(){
        return(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA);
    }

    private double getHalfOfCircuit(){
        return (sideA + sideB + sideC)/2;
    }

}
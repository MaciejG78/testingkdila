package com.example.labs.AppCreateObjectWithAbstractClass;


/*
Zadanie:tworzenie obiektów z wykorzystaniem klasy abstrakcyjnej
        Wykorzystując kod stworzony przez nas w tym submodule: https://kodilla.com/pl/project-java/38595,
        utwórz nowe obiekty pracowników:pracownika zarabiającego 5zł za stworzenie jednego produktu,
        pracownika,który zarabia pensję podstawową 2000zł i 20%tej pensji,jeżeli zrealizuje dodatkową sprzedaż dowolnego produktu.
*/


public class AppCreateObjectWithAbstractClass {

    public static void main(String[] args) {
        FixedSalaryEmployee employeeFixed = new FixedSalaryEmployee(2000.0);
        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employeeFixed);
        System.out.println("\n-------------------------- FixedSalaryEmployee --------------------------");
        processor1.processPayout();

        HourlySalaryEmployee employeeHourly = new HourlySalaryEmployee(35.0, 160);
        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employeeHourly);
        System.out.println("\n-------------------------- HourlySalaryEmployee --------------------------");
        processor2.processPayout();

        SalaryPerProductEmployee employeePerProduct = new SalaryPerProductEmployee(350, 5.0);
        SalaryPayoutProcessor processor3 = new SalaryPayoutProcessor(employeePerProduct);
        System.out.println("\n-------------------------- SalaryPerProductEmployee --------------------------");
        processor3.processPayout();

        SalaryWithOrNoBonusEmployee employeeWithBonus = new SalaryWithOrNoBonusEmployee(2000.0, true);
        SalaryPayoutProcessor processor4 = new SalaryPayoutProcessor(employeeWithBonus);
        System.out.println("\n-------------------------- SalaryWithBonusEmployee --------------------------");
        processor4.processPayout();

        SalaryWithOrNoBonusEmployee employeeWithoutBonus = new SalaryWithOrNoBonusEmployee(2000.0, false);
        SalaryPayoutProcessor processor5 = new SalaryPayoutProcessor(employeeWithoutBonus);
        System.out.println("\n-------------------------- SalaryWithoutBonusEmployee --------------------------");
        processor5.processPayout();
    }
}

interface Employee {
    double calculateSalary();
}

class FixedSalaryEmployee implements Employee {
    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}

class SalaryPerProductEmployee implements Employee {
    private int productQuantity;
    private double oneProductPay;

    public SalaryPerProductEmployee(int productQuantity, double oneProductPay) {
        this.productQuantity = productQuantity;
        this.oneProductPay = oneProductPay;
    }

    public double calculateSalary() {
        return this.productQuantity * this.oneProductPay;
    }
}

class SalaryWithOrNoBonusEmployee implements Employee {
    private double salary;
    private double percentOfBonus = 20.0;
    private boolean isBonus;

    public SalaryWithOrNoBonusEmployee(double salary, boolean isBonus) {
        this.salary = salary;
        this.isBonus = isBonus;
    }

    public double calculateSalary() {
        return this.salary + (isBonus ? this.salary * this.percentOfBonus / 100 : 0);
    }
}

class HourlySalaryEmployee implements Employee {
    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }
}

// Payout
abstract class SalaryPayout {
    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}

class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }
}
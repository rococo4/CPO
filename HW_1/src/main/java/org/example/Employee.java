package org.example;

public abstract class Employee {
    protected int Salary;
    public abstract void Work();

    public static int countOfWorkers = 0;
    public Employee (int salary) {
        Salary = salary;
        countOfWorkers++;
    }
}

package org.example;

public class Secretary extends Employee {

    public Secretary(int salary) {
        super(salary);
    }

    @Override
    public void Work() {
        System.out.print("I AM SECRETARING WITH SALARY:");
        System.out.println(Salary);
    }
    public void ToSecretary() {
        System.out.println("SECRETARY!");
    }
}

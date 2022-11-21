package org.example;

public class Programmer extends Employee{
    public Programmer(int salary) {
        super(salary);
    }

    @Override
    public void Work() {
        System.out.print("I am programming with Salary");
        System.out.println(Salary);
    }
    public void ToProgram() {
        System.out.println("PROGRAMMING!");
    }
}

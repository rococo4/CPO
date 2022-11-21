package org.example;

public class Manager extends Employee {

    public Manager(int salary) {
        super(salary);
    }

    @Override
    public void Work() {
        System.out.print("Manager is managing with salary: ");
        System.out.println(Salary);
    }
    public void Manage() {
        System.out.println("Manage!");
    }
}

package org.example;

public class Executive extends Manager {

    public Executive(int salary) {
        super(salary);
    }
    public void ToExecutiveManager() {
        System.out.println("EXECUTIVE MANAGING!");
    }
}

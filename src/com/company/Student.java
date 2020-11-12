package com.company;

public class Student {
    private String name = "";
    private double gpa = 0;

    public Student() {
        setGpa(0);
        setName("");
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public boolean ifScholarship(){
        return getGpa() > 5.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

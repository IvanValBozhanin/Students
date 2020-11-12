package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int numberOfStudents = 5;
	    Student [] a = new Student[numberOfStudents];
        for(int i = 0 ;i<numberOfStudents; ++ i){
            System.out.println("Enter name and GPA of the student " + (i+1) + ": ");
            String name = in.next();
            double gpa = in.nextDouble();
            a[i]= new Student(name, gpa);
        }
        printStudentsWithScholarships(a);
    }

    public static void printStudentsWithScholarships(Student [] a){
        for (Student student : a) {
            if (student.ifScholarship()) {
                System.out.println(student.getName() + ' ' + student.getGpa());
            }
        }
    }
}

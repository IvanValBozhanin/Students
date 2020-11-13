/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
        System.out.println("Students with scholarships: ");
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
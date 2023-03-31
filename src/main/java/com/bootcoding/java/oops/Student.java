package com.bootcoding.java.oops;


import java.util.Random;

public class Student {
    String name;
    int rollNo;
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;
    double avgMarks;
    double percentage;
    char grade ;


    public void display () {

        System.out.println(rollNo);
        System.out.println(physicsMarks);
        System.out.println(chemistryMarks);
        System.out.println(mathsMarks);
        System.out.println("Average Marks =" + avgMarks);
        System.out.println("Percentage =" + percentage + "%");
        System.out.println(grade);

    }
    public void calculateAverage() {
        avgMarks = (physicsMarks + chemistryMarks + mathsMarks) / 3.0;

    }

    public void calculatePercentage() {
        percentage = ((physicsMarks + chemistryMarks + mathsMarks) / 300.0) * 100.0;

    }

    public void grade() {

        if (percentage >= 60 ) {
           grade = 'A';
        }

        else if (percentage >= 50) {
            grade = 'B';

        } else {
            grade = 'C';
        }
    }





    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            Student s1 = new Student();
            s1.name = "Rajat";
            s1.rollNo = i;
            s1.physicsMarks = 10 + random.nextInt(90);
            s1.chemistryMarks = 10 + random.nextInt(90);
            s1.mathsMarks = 10 + random.nextInt(90);
            s1.calculateAverage();
            s1.calculatePercentage();
            s1.grade();
            s1.display();


        }
    }
}

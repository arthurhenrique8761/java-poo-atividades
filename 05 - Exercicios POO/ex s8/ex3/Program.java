package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.3f\n", student.finalGrade());
        System.out.println(student.evaluation());

        sc.close();
    }

}
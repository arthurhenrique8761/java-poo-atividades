package entities;

public class Student {

    public String name;
    public double gradeA;
    public double gradeB;
    public double gradeC;

    public double finalGrade() {
        return gradeA + gradeB + gradeC;
    }

    public String evaluation() {
        if (finalGrade() < 60.0) {
            return "FAILED" + String.format("\nMISSING: %.3f POINTS", 60-finalGrade());
        }
    }

}
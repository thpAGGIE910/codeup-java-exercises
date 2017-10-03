package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for(double grade : this.grades) {
            sum += grade;
        }

        return sum / this.grades.size();
    }
    /*
    public static void main(String[] args) {
        Student travis = new Student("Travis Payne");
        System.out.println("Adding a grade of 100 to Travis's grades...");
        travis.addGrade(100);
        System.out.println("Adding a grade of 95 to Travis's grades...");
        travis.addGrade(95);
        System.out.println("Adding a grade of 90 to Travis's grades...");
        travis.addGrade(90);

        System.out.printf("Calculating Travis's average, expecting 95...\n%f", travis.getGradeAverage());
    }
    */
}
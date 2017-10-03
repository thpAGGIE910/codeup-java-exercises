package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Student newStudent = new Student("Travis Payne");
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();
        String userChoice;
        boolean finished = false;

        newStudent.addGrade(100);
        newStudent.addGrade(95);
        newStudent.addGrade(90);
        students.put("thpAGGIE910", newStudent);

        newStudent = new Student("Monalisa Octocat");
        newStudent.addGrade(80);
        newStudent.addGrade(83);
        newStudent.addGrade(87);
        students.put("octocat", newStudent);

        newStudent = new Student("Brandon Gossen");
        newStudent.addGrade(90);
        newStudent.addGrade(88);
        newStudent.addGrade(94);
        students.put("brandonbcg123", newStudent);

        newStudent = new Student("Daniel Strolle");
        newStudent.addGrade(95);
        newStudent.addGrade(91);
        newStudent.addGrade(86);
        students.put("danielstrolle", newStudent);

        System.out.println("Welcome!\n\nHere are the students Github user names:\n");

        String userNames = "";
        for(String userName : students.keySet()) {
            userNames += String.format("|%s| ", userName);
        }

        do {
            System.out.printf("%s\n\n", userNames);
            userChoice = input.getString("What student would you like to see more information on?\n\n> ");

            if(students.containsKey(userChoice)) {
                Student selectedStudent = students.get(userChoice);
                System.out.printf("Name: %s - Github Username: %s\nCurrent Average: %-3.1f\n",
                        selectedStudent.getName(), userChoice, selectedStudent.getGradeAverage());
            }
            else {
                System.out.printf("\nSorry, no student found with github username \"%s\"\n\n", userChoice);
            }

            finished = !input.getString("Would you like to see another student\n\n> ").toLowerCase().startsWith("y");

        } while(!finished);
    }
}
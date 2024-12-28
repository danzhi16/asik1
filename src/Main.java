import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        try {
            File teacherFile = new File("/Users/danial/IdeaProjects/Assignment 1/src/Teachers .txt");
            Scanner teacherScanner = new Scanner(teacherFile);

            while (teacherScanner.hasNextLine()) {
                String line = teacherScanner.nextLine();
                String[] data = line.split(" ");
                String name = data[0];
                String surname = data[1];
                int age = Integer.parseInt(data[2]);
                boolean gender = data[3].equalsIgnoreCase("Male");
                String subject = data[4];
                int yearsOfExperience = Integer.parseInt(data[5]);
                int salary = Integer.parseInt(data[6]);

                Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);

                if(yearsOfExperience > 10){
                    teacher.giveRaise(10);
                }

                school.addMember(teacher);

            }
            teacherScanner.close();

            File studentFile = new File("/Users/danial/IdeaProjects/Assignment 1/src/Students.txt");
            Scanner studentScanner = new Scanner(studentFile);

            while (studentScanner.hasNextLine()) {
                String line = studentScanner.nextLine();
                String[] data = line.split(" ");
                String name = data[0];
                String surname = data[1];
                int age = Integer.parseInt(data[2]);
                boolean gender = data[3].equalsIgnoreCase("Male");

                Student student = new Student(name, surname, age, gender);

                for(int i = 4; i<data.length; i++){
                    student.addGrade(Integer.parseInt(data[i]));
                }

                school.addMember(student);

            }
            studentScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println("School Members:");
        System.out.println(school.toString());
    }
}
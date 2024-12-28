import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private ArrayList<Integer> grades;
    private int count;
    private int gpa;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int grade : grades) {
            if (grade >= 95 && grade <= 100) sum += 4.0;
            if (grade >= 90 && grade < 95) sum += 3.67;
            if (grade >= 85 && grade < 90) sum += 3.33;
            if (grade >= 80 && grade < 85) sum += 3.0;
            if (grade >= 75 && grade < 80) sum += 2.67;
            if (grade >= 70 && grade < 75) sum += 2.33;
            if (grade >= 65 && grade < 70) sum += 2.0;
            if (grade >= 60 && grade < 65) sum += 1.67;
            if (grade >= 55 && grade < 60) sum += 1.33;
            if (grade >= 50 && grade < 55) sum += 1.0;
            if (grade >= 25 && grade < 50) sum += 0.0;
            if (grade >= 0 && grade < 25) sum += 0.0;

            count++;
        }
        sum = sum / count;
        System.out.println(sum);
        return sum;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + getId() + " GPA " + calculateGPA();
    }
}
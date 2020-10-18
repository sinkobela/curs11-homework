package extramile;

import java.util.List;

public class StudentGradeMain {
    public static void main(String[] args) throws Exception {
        StudentReader students = new StudentReader("src/extramile/StudentGrades.txt");
        List<StudentGrade> studentGrades = students.readFile();
        Classroom classroom = new Classroom(studentGrades);

        System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForStudent("Neela Amaltheia"));
        System.out.println(classroom.getMaxGradeFromDiscipline("Computer Science"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println(classroom.getWorstGrade("Physics"));

    }
}

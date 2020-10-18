package extramile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentList;

    public Classroom(List<StudentGrade> studentList) {
        this.studentList = new ArrayList<>(studentList);
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesList = new ArrayList<>();
        for (StudentGrade obj : studentList) {
            if (obj.getDiscipline().equalsIgnoreCase(discipline)) {
                gradesList.add(obj.getGrade());
            }
        }
        return gradesList;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> gradesList = new ArrayList<>();
        for (StudentGrade obj : studentList) {
            if (obj.getName().equalsIgnoreCase(student)) {
                gradesList.add(obj.getGrade());
            }
        }
        return gradesList;
    }

    public int getMaxGradeFromDiscipline(String discipline) {
        return Collections.max(getGradesForDiscipline(discipline));
    }

    public int getMaxGrade() {
        int max = 0;
        for (StudentGrade obj : studentList) {
            if (obj.getGrade() > max) {
                max = obj.getGrade();
            }
        }
        return max;
    }

    public int getAverageGrade(String discipline) {
        int sum = 0;
        List<Integer> grades = getGradesForDiscipline(discipline);
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public int getWorstGrade(String discipline) {
        return Collections.min(getGradesForDiscipline(discipline));
    }

    public List<StudentGrade> getStudentList() {
        return new ArrayList<>(studentList);
    }
}

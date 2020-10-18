package extramile;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader {

    private final String path;

    public StudentReader(String path) {
        this.path = path;
    }

    public List<StudentGrade> readFile() throws Exception {
        List<StudentGrade> listOfStudentGrades = new ArrayList<>();

        Scanner file = new Scanner(new FileReader(path));
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] arr = line.split("\\|");
            listOfStudentGrades.add(new StudentGrade(arr[0], arr[1], Integer.parseInt(arr[2])));
        }
        return listOfStudentGrades;
    }

    public String getPath() {
        return path;
    }
}

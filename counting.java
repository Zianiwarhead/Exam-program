import java.util.ArrayList;
import java.util.List;

class Assessment {
    String unit;
    String title;

    Assessment(String unit, String title) {
        this.unit = unit;
        this.title = title;
    }
}

public class CountAssessments {

    public static int countAssessments(List<Assessment> assessments) {
        int count = 0;
        for (Assessment assessment : assessments) {
            if (assessment.unit.equals("DIT409")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Assessment> assessmentsList = new ArrayList<>();
        assessmentsList.add(new Assessment("DIT409", "Assignment 1"));
        assessmentsList.add(new Assessment("DIT409", "Assignment 2"));
        assessmentsList.add(new Assessment("DIT410", "Assignment 1"));
        assessmentsList.add(new Assessment("DIT409", "Assignment 3"));
        assessmentsList.add(new Assessment("DIT411", "Assignment 1"));

        int numAssessments = countAssessments(assessmentsList);
        System.out.println("Number of assessments in DIT409: " + numAssessments);
    }
}
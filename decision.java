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

public class CourseworkAssessment {

    public static int countAssessments(List<Assessment> assessments) {
        int count = 0;
        for (Assessment assessment : assessments) {
            if (assessment.unit.equals("DIT409")) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasCompletedTwoThirds(int totalAssessments, int completedAssessments) {
        return completedAssessments >= (2.0 / 3.0) * totalAssessments;
    }

    public static double calculateCourseworkScore(double ass1, double ass2, double ass3, double cat1, double cat2) {
        return (ass1 + ass2 + ass3 + cat1 + cat2) / 5;
    }

    public static double calculateTotalScore(double courseworkScore, double finalExamScore) {
        return (courseworkScore * 0.5) + (finalExamScore * 0.5);
    }

    public static void main(String[] args) {
        List<Assessment> assessmentsList = new ArrayList<>();
        assessmentsList.add(new Assessment("DIT409", "Assignment 1"));
        assessmentsList.add(new Assessment("DIT409", "Assignment 2"));
        assessmentsList.add(new Assessment("DIT410", "Assignment 1"));
        assessmentsList.add(new Assessment("DIT409", "Assignment 3"));
        assessmentsList.add(new Assessment("DIT411", "Assignment 1"));

        int totalAssessments = 5; 
        int completedAssessments = countAssessments(assessmentsList);

        if (!hasCompletedTwoThirds(totalAssessments, completedAssessments)) {
            System.out.println("The student is required to repeat irrespective of Final Exam Grade.");
            return;
        }

        double ass1 = 80.0;
        double ass2 = 85.0;
        double ass3 = 90.0;
        double cat1 = 75.0;
        double cat2 = 88.0;

        double courseworkScore = calculateCourseworkScore(ass1, ass2, ass3, cat1, cat2);
        double finalExamScore = 82.0; 

        double totalScore = calculateTotalScore(courseworkScore, finalExamScore);

        System.out.println("Coursework Score: " + courseworkScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Total Score: " + totalScore);
    }
}
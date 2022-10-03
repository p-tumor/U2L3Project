import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private int testScoreCount;
    ArrayList<Double> accumulatedTestScores = new ArrayList<>();

    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }

    public void updateGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void addTestScore(double testScore) {
        accumulatedTestScores.add(testScore);
        testScoreCount++;
    }

    public int getTestScoreCount() {
        return testScoreCount;
    }

    public double avgTestScore() {
        double sum = 0;
        double avg = 0;
        for (double score: accumulatedTestScores) {
            sum += score;
            avg = sum / testScoreCount;
        }
        return avg;
    }

    public void printStudentInfo()
    {
        System.out.printf("Student Name: %s %s\n",firstName,lastName);
        System.out.printf("Graduation Year: %d\n",gradYear);
        System.out.println("Average Test Score: "+avgTestScore());
        System.out.printf("Number of Tests Averaged: %d\n",testScoreCount);
    }
}

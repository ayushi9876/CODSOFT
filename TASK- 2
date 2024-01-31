import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int totalSub = sc.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= totalSub; i++) {
            System.out.println("Marks obtained in subject" + i + ":");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks");
                i--;
            } else {
                totalMarks += marks;
            }
        }
        float avgPercentage = ((float) totalMarks / totalSub);
        System.out.println("Result");
        System.out.println("Total marks:" + totalMarks);
        System.out.println("Average percentage: " + avgPercentage);
        System.out.println("Grade: " + calculateGrade(avgPercentage));
    }

    private static String calculateGrade(float avgPercentage) {
        if (avgPercentage >= 90) {
            System.out.println("Pass");
            return "A+";
        }
        else if (avgPercentage >= 80) {
            System.out.println("Pass");
            return "A";
        }
        else if (avgPercentage >= 70) {
            System.out.println("Pass");
            return "B";
        }
        else if (avgPercentage >= 60) {
            System.out.println("Pass");
            return "C";
        }
        else if (avgPercentage >= 50) {
            System.out.println("Pass");
            return "D";
        }
        else if (avgPercentage >= 40) {
            System.out.println("Pass");
            return "E";
        }
        else {
            System.out.println("Fail");
            return "F";
        }
    }
}

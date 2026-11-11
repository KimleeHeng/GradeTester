public class GradeBook {

    private String courseName;
    private final int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayGrades() {

        for(int x = 0; x < grades.length; x++){
            System.out.printf("%-11s%-7s", "", "Test " + (x+1));
        }
        System.out.println();
        // for loop to show the grades
        for (int row = 0; row < grades.length; row++) {
            // Will display student label for each student
            System.out.printf("%-11s ", "Student " + (row + 1));
            for (int col = 0; col < grades[row].length; col++){
                System.out.printf("%-11d ",grades[row][col]);
            }
            System.out.println(getAverage(grades[row]));
        }
    }

    public double getAverage(int[] setOfGrades){

        int total = 0;
        double average;

        // code below will calculate average of each student's grade
        for(int x = 0; x < setOfGrades.length; x++){
            total += setOfGrades[x];
        }

        return (double) total / setOfGrades.length;


    }
}




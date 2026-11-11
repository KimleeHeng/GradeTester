public class GradeBookTester {
    public static void main(String[] args){
        int[][] mathGrades = {{90, 95, 100},
                               {80, 45, 90},
                               {65, 70, 65}};

        GradeBook Math = new GradeBook("Intro to Math", mathGrades);

        System.out.println("Welcome to the gradebook for:");
        System.out.println(Math.getCourseName());

        Math.displayGrades();
    }
}



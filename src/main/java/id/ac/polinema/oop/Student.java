package id.ac.polinema.oop;

/**
 * Student class.
 *
 * TASK: Complete every section marked TODO below.
 * Do not change the class name, method names, or method signatures —
 * the autograder calls them exactly as defined here.
 */
public class Student {

    // TODO: add fields: studentId (String), name (String), gpa (double)

     
     String studentId; 
     String name;      
     double gpa;       
     
    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    /**
     * Determines the graduation predicate based on GPA:
     * - gpa >= 3.5           -> "Cum Laude"
     * - 3.0 <= gpa < 3.5     -> "Very Satisfactory"
     * - gpa < 3.0            -> "Satisfactory"
     *
     * @return graduation predicate
     */
    public String getPredicate() {
        if (this.gpa >= 3.5) {
            return "Cum Laude";
        } else if (this.gpa > 3.0) {
            return "Very Satisfactory";
        } else {
            return "Satisfactory";
        }
    }
}

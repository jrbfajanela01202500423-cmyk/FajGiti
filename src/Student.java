// ABSTRACT CLASS
// This serves as the blueprint for all student types

abstract class Student {

    // =========================
    // ENCAPSULATION
    // Private fields
    // =========================
    private String name;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;

    // Constructor
    public Student(String name, double mathGrade, double scienceGrade, double englishGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    // =========================
    // GETTERS
    // =========================
    public String getName() {
        return name;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    // =========================
    // ABSTRACT METHOD
    // POLYMORPHISM
    // =========================
    // Each student type computes
    // average differently
    public abstract double calculateAverage();

    // =========================
    // Determine remarks
    // =========================
    public String getRemarks() {

        double avg = calculateAverage();

        if (avg >= 98) {
            return "WITH HONORS";
        } else if (avg >= 75) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }

    // =========================
    // Student Type
    // =========================
    public abstract String getType();
}
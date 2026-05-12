// INHERITANCE
// RegularStudent inherits Student

class RegularStudent extends Student {

    // Constructor
    public RegularStudent(String name, double math, double science, double english) {

        // Call parent constructor
        super(name, math, science, english);
    }

    // =========================
    // POLYMORPHISM
    // Override calculateAverage()
    // =========================
    @Override
    public double calculateAverage() {

        // Simple average
        return (getMathGrade() + getScienceGrade() + getEnglishGrade()) / 3;
    }

    @Override
    public String getType() {
        return "Regular";
    }
}
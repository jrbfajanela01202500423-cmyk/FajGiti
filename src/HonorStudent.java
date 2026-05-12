// HonorStudent inherits Student

class HonorStudent extends Student {

    // Constructor
    public HonorStudent(String name, double math, double science, double english) {

        super(name, math, science, english);
    }

    // =========================
    // POLYMORPHISM
    // Different implementation
    // =========================
    @Override
    public double calculateAverage() {

        // Compute regular average
        double avg = (getMathGrade() + getScienceGrade() + getEnglishGrade()) / 3;

        // Add bonus points
        avg += 5;

        // Maximum should not exceed 100
        if (avg > 100) {
            avg = 100;
        }

        return avg;
    }

    @Override
    public String getType() {
        return "Honor";
    }
}
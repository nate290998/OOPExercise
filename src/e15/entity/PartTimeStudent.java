package e15.entity;

import java.util.List;

public class PartTimeStudent extends Student {
    private String trainingLocation;

    public PartTimeStudent(String studentId, String fullName, String dob, int startYear, double entryScore,
            List<StudyResult> results, String trainingLocation) {
        super(studentId, fullName, dob, startYear, entryScore, results);
        this.trainingLocation = trainingLocation;
    }

    public PartTimeStudent(String trainingLocation) {
        super();
    }

    @Override
    public boolean isRegular() {
        return false;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }

}

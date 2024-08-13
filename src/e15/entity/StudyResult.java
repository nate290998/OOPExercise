package e15.entity;

public class StudyResult {
    private String termName;
    private double averageScore;

    public StudyResult(String termName, double averageScore) {
        this.termName = termName;
        this.averageScore = averageScore;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

}

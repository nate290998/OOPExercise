package e15.entity;

import java.util.List;

public class RegularStudent extends Student {

    public RegularStudent() {
        super();
    }

    public RegularStudent(String studentId, String fullName, String dob, int startYear, double entryScore,
            List<StudyResult> results) {
        super(studentId, fullName, dob, startYear, entryScore, results);
    }

    @Override
    public boolean isRegular() {
        return true;
    }

}

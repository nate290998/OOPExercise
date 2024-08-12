package e14.entity;

import e14.exception.InvalidDOBException;
import e14.exception.InvalidFullNameException;
import e14.exception.InvalidPhoneNumberException;

public class NormalStudent extends Student {
    private int englishScore;
    private double entryTestScore;

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
            String gradeLevel, int englishScore, double entryTestScore)
            throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showMyInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + doB);
        System.out.println("Sex: " + sex);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("University Name: " + universityName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("English Score: " + englishScore);
        System.out.println("Entry Test Score: " + entryTestScore);
    }
}

package e14.entity;

import e14.exception.InvalidDOBException;
import e14.exception.InvalidFullNameException;
import e14.exception.InvalidPhoneNumberException;

public class GoodStudent extends Student {
    private double gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
            String gradeLevel, double gpa, String bestRewardName)
            throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showMyInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + doB);
        System.out.println("Sex: " + sex);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("University Name: " + universityName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("Best Reward Name: " + bestRewardName);
    }
}

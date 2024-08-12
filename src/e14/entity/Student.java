package e14.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import e14.exception.InvalidDOBException;
import e14.exception.InvalidFullNameException;
import e14.exception.InvalidPhoneNumberException;

public abstract class Student {
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName,
            String gradeLevel) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        setFullName(fullName);
        setDoB(doB);
        setPhoneNumber(phoneNumber);
        this.sex = sex;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDoB() {
        return doB;
    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setFullName(String fullName) throws InvalidFullNameException {
        if (fullName.length() < 10 || fullName.length() > 50) {
            throw new InvalidFullNameException("Full name must be between 10 and 50 characters.");
        }
        this.fullName = fullName;
    }

    public void setDoB(String doB) throws InvalidDOBException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(doB);
            this.doB = sdf.format(date);
        } catch (ParseException e) {
            throw new InvalidDOBException("Date of Birth must be in format dd/MM/yyyy.");
        }
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("^(090|098|091|031|035|038)\\d{7}$")) {
            throw new InvalidPhoneNumberException(
                    "Phone number must start with 090, 098, 091, 031, 035, or 038 and be 10 digits long.");
        }
        this.phoneNumber = phoneNumber;
    }

    public abstract void showMyInfo();
}

package example_13.entity;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee {

    private String major;

    private int semester;

    private String universityNames;

    public Intern() {
        super();
    }

    public Intern(String major, int semester, String universityNames) {

        super();

        this.major = major;

        this.semester = semester;

        this.universityNames = universityNames;

    }

    public Intern(String id, String fullName, LocalDate birthDay, String phone, String email,

            List<Certificate> listCertificates, String major, int semester, String universityNames) {

        super(id, fullName, birthDay, phone, email, listCertificates);

        this.major = major;

        this.semester = semester;

        this.universityNames = universityNames;

    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public String getMajor() {

        return major;

    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {

        this.semester = semester;

    }

    public String getUniversityNames() {

        return universityNames;

    }

    public void setUniversityNames(String universityNames) {

        this.universityNames = universityNames;

    }

    @Override

    public String toString() {

        return "Intern [major=" + major + ", semester=" + semester + ", universityNames=" + universityNames + ", id="

                + id + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email

                + ", listCertificates=" + listCertificates.toString() + "]";

    }

}

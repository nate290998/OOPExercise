package example_13.entity;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {

    private LocalDate graduationDate;

    private String graduationRank;

    private String universityName;

    public Fresher() {
        super();
    }

    public Fresher(LocalDate graduationDate, String graduationRank, String universityName) {

        super();

        this.graduationDate = graduationDate;

        this.graduationRank = graduationRank;

        this.universityName = universityName;

    }

    public Fresher(String id, String fullName, LocalDate birthDay, String phone, String email,

            List<Certificate> listCertificates, LocalDate graduationDate, String graduationRank,

            String universityName) {

        super(id, fullName, birthDay, phone, email, listCertificates);

        this.graduationDate = graduationDate;

        this.graduationRank = graduationRank;

        this.universityName = universityName;

    }

    public LocalDate getGraduationDate() {

        return graduationDate;

    }

    public void setGraduationDate(LocalDate graduationDate) {

        this.graduationDate = graduationDate;

    }

    public String getGraduationRank() {

        return graduationRank;

    }

    public void setGraduationRank(String graduationRank) {

        this.graduationRank = graduationRank;

    }

    public String getUniversityName() {

        return universityName;

    }

    public void setUniversityName(String universityName) {

        this.universityName = universityName;

    }

    @Override

    public void showInformation() {
        System.out.println(this);
    }

    @Override

    public String toString() {

        return "Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", universityName="

                + universityName + ", id=" + id + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone="

                + phone + ", email=" + email + ", listCertificates=" + listCertificates.toString() + "]";

    }

}

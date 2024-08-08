package example_13.entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {

    private int yearOfExperience;

    private String proSkill;

    public Experience(String id, String fullName, LocalDate birthDay, String phone, String email,

            List<Certificate> listCertificates, int yearOfExperience, String proSkill) {

        super(id, fullName, birthDay, phone, email, listCertificates);

        this.yearOfExperience = yearOfExperience;

        this.proSkill = proSkill;

    }

    @Override

    public void showInformation() {
        System.out.println(this.id + "," + this.fullName + "," + this.birthDay + "," + this.phone + "," + this.email
                + "," + this.listCertificates.toString() + "," + this.yearOfExperience + "," + this.proSkill);
    }

    public int getYearOfExperience() {

        return yearOfExperience;

    }

    public void setYearOfExperience(int yearOfExperience) {

        this.yearOfExperience = yearOfExperience;

    }

    public String getProSkill() {

        return proSkill;

    }

    public void setProSkill(String proSkill) {

        this.proSkill = proSkill;

    }

    @Override

    public String toString() {

        return "Experience [yearOfExperience=" + yearOfExperience + ", proSkill=" + proSkill + ", id=" + id

                + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email

                + ", listCertificates=" + listCertificates + "]";

    }

}

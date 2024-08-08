package example_13.entity;

import java.time.LocalDate;
import java.util.List;

//abstract keyword use to implement the functionality
public abstract class Employee {
    // Use only to set the accessibility to the outside classes inherited the
    // Employee subclass
    protected String id;

    protected String fullName;

    protected LocalDate birthDay;

    protected String phone;

    protected String email;

    protected List<Certificate> listCertificates;

    // super(); : show the constructor of the super class or Object class (default
    // class of Java)
    public Employee() {
        super();
    }

    // this: refers to current object (Employee)

    public Employee(String id, String fullName, LocalDate birthDay, String phone, String email,

            List<Certificate> listCertificates) {

        super();

        this.id = id;

        this.fullName = fullName;

        this.birthDay = birthDay;

        this.phone = phone;

        this.email = email;

        this.listCertificates = listCertificates;

    }

    public abstract void showInformation();

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getFullName() {

        return fullName;

    }

    public void setFullName(String fullName) {

        this.fullName = fullName;

    }

    public LocalDate getBirthDay() {

        return birthDay;

    }

    public void setBirthDay(LocalDate birthDay) {

        this.birthDay = birthDay;

    }

    public String getPhone() {

        return phone;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public List<Certificate> getListCertificates() {

        return listCertificates;

    }

    public void setListCertificates(List<Certificate> listCertificates) {
        this.listCertificates = listCertificates;
    }

}

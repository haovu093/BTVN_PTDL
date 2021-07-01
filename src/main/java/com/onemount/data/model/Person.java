package com.onemount.data.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private String email;
    private String job;
    private String gender;
    private String city;
    private int salary;
    private LocalDate birthdate;

    public Person(String name, String email, String job, String gender, String city, int salary, LocalDate birthdate) {
        this.name = name;
        this.email = email;
        this.job = job;
        this.gender = gender;
        this.city = city;
        this.salary = salary;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public int getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

}
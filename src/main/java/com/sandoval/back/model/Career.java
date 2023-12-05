package com.sandoval.back.model;

import jakarta.persistence.*;

@Entity
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCareer;

    @Column(name = "career_name")
    private String careerName;

    @Column(name = "condition_description")
    private String condition;

    private String department;

    public Career() {
    }

    public Career(String careerName, String condition, String department) {
        this.careerName = careerName;
        this.condition = condition;
        this.department = department;
    }

    public Long getIdCareer() {
        return idCareer;
    }

    public void setIdCareer(Long idCareer) {
        this.idCareer = idCareer;
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

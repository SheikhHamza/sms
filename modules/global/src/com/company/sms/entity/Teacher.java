package com.company.sms.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Table(name = "SMS_TEACHER")
@Entity(name = "sms_Teacher")
@NamePattern("%s|name")
public class Teacher extends StandardEntity {
    private static final long serialVersionUID = 1485287768367408187L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "QUALIFICATION", nullable = false)
    private String qualification;

    @OneToMany(mappedBy = "teacherId")
    private List<TeacherAsistant> assistants;

    @NotNull
    @Column(name = "AGE", nullable = false)
    @Positive
    @Max(100)
    @Min(10)
    private Integer age;

    @NotNull
    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    public List<TeacherAsistant> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<TeacherAsistant> assistants) {
        this.assistants = assistants;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
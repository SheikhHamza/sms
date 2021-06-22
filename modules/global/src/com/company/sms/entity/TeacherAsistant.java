package com.company.sms.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "SMS_TEACHER_ASISTANT")
@Entity(name = "sms_TeacherAsistant")
@NamePattern("%s|name")
public class TeacherAsistant extends StandardEntity {
    private static final long serialVersionUID = -2549146709654967801L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "GRADE", nullable = false)
    @Min(5)
    @Max(10)
    private Integer grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEACHER_ID_ID")
    private Teacher teacherId;

    @NotNull
    @Column(name = "AGE", nullable = false)
    @Max(40)
    @Min(10)
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
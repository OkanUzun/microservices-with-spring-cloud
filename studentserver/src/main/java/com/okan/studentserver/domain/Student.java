package com.okan.studentserver.domain;

/**
 * @author Okan UZUN
 * @date 2019-05-11
 */
public class Student {
    private String no;
    private String firstName;
    private String surName;

    public Student(final String no, final String firstName, final String surName) {
        this.no = no;
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(final String no) {
        this.no = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(final String surName) {
        this.surName = surName;
    }
}

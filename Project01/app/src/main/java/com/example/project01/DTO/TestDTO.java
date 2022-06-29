package com.example.project01.DTO;

import java.util.Date;

public class TestDTO {

    String test_name, class_id;
    Date test_date;
    int test_score;

    public TestDTO(String test_name, String class_id, Date test_date, int test_score) {
        this.test_name = test_name;
        this.class_id = class_id;
        this.test_date = test_date;
        this.test_score = test_score;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public Date getTest_date() {
        return test_date;
    }

    public void setTest_date(Date test_date) {
        this.test_date = test_date;
    }

    public int getTest_score() {
        return test_score;
    }

    public void setTest_score(int test_score) {
        this.test_score = test_score;
    }
}

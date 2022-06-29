package com.example.project01.DTO;

import java.util.Date;

public class HomeworkDTO {

    String homework_name, class_id;
    int homework_score;
    Date homework_date;
    boolean homework_done;

    public HomeworkDTO(String homework_name, String class_id, int homework_score, Date homework_date, boolean homework_done) {
        this.homework_name = homework_name;
        this.class_id = class_id;
        this.homework_score = homework_score;
        this.homework_date = homework_date;
        this.homework_done = homework_done;
    }

    public String getHomework_name() {
        return homework_name;
    }

    public void setHomework_name(String homework_name) {
        this.homework_name = homework_name;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public int getHomework_score() {
        return homework_score;
    }

    public void setHomework_score(int homework_score) {
        this.homework_score = homework_score;
    }

    public Date getHomework_date() {
        return homework_date;
    }

    public void setHomework_date(Date homework_date) {
        this.homework_date = homework_date;
    }

    public boolean isHomework_done() {
        return homework_done;
    }

    public void setHomework_done(boolean homework_done) {
        this.homework_done = homework_done;
    }
}

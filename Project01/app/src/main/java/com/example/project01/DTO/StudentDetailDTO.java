package com.example.project01.DTO;

public class StudentDetailDTO {
    String school_id, parent_phone, student_phone, checkin_hour, checkout_hour;
    int grade;

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public String getParent_phone() {
        return parent_phone;
    }

    public void setParent_phone(String parent_phone) {
        this.parent_phone = parent_phone;
    }

    public String getStudent_phone() {
        return student_phone;
    }

    public void setStudent_phone(String student_phone) {
        this.student_phone = student_phone;
    }

    public String getCheckin_hour() {
        return checkin_hour;
    }

    public void setCheckin_hour(String checkin_hour) {
        this.checkin_hour = checkin_hour;
    }

    public String getCheckout_hour() {
        return checkout_hour;
    }

    public void setCheckout_hour(String checkout_hour) {
        this.checkout_hour = checkout_hour;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public StudentDetailDTO(String school_id, String parent_phone, String student_phone, String checkin_hour, String checkout_hour, int grade) {
        this.school_id = school_id;
        this.parent_phone = parent_phone;
        this.student_phone = student_phone;
        this.checkin_hour = checkin_hour;
        this.checkout_hour = checkout_hour;
        this.grade = grade;
    }

}

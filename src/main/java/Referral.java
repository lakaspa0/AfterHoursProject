/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lakaspa0
 */

import java.util.*;

public class Referral{
    private Student student;
    private Teacher teacher;
    private String date;
    private String reason;
    ArrayList<Referral> aHList = new ArrayList<Referral>();
    
    public Referral(){
        student = null;
        teacher = null;
        date = null;
        reason = null;
        aHList.add(this);
    }
    
    public Referral(Student student, Teacher teacher, String date, String reason){
        this.student = student;
        this.teacher = teacher;
        this.date = date;
        this.reason = reason;
        aHList.add(this);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    
}

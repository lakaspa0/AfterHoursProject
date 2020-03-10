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

public class Student {
    private String fName;
    private String lName;
    private String grade;
    private String email;
    ArrayList<Student> stuList = new ArrayList<Student>();
    
    public Student(){
        fName = null;
        lName = null;
        email = null;
        stuList.add(this);
    }
    
    public Student(String fName, String lName, String grade, String email){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        stuList.add(this);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

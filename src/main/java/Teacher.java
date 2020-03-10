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

public class Teacher {
    private String fName;
    private String lName;
    private String email;
    ArrayList<Teacher> teachList = new ArrayList<Teacher>();
    
    public Teacher(){
        fName = null;
        lName = null;
        email = null;
        teachList.add(this);
    }
    
    public Teacher(String fName, String lName, String email){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        teachList.add(this);
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

    @Override
    public String toString() {
        return "Teacher{" + "fName=" + fName + ", lName=" + lName + ", email=" + email + '}';
    }
    
    
}

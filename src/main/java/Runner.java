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
import java.io.*;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException
    {
        //importing teacher files
        Scanner inFile = new Scanner(new FileReader("studentList.csv"));
        Scanner inFile2 = new Scanner(new FileReader("teacherList.csv"));
        inFile.useDelimiter(",|\\n");
        inFile2.useDelimiter(",|\\n");
        
        //creating teacher arraylist
        ArrayList<Teacher> teachList = new ArrayList<Teacher>();
        while(inFile2.hasNext()){
            String tempFirst = inFile2.next();
            String tempLast = inFile2.next();
            String tempEmail = inFile2.next();
            Teacher tempTeacher = new Teacher(tempFirst, tempLast, tempEmail);
            teachList.add(tempTeacher);
        }
        
        //creating student arraylist
        ArrayList<Student> stuList = new ArrayList<Student>();
        while(inFile.hasNext()){
            String tempSFirst = inFile.next();
            String tempSLast = inFile.next();
            String tempGrade = inFile.next();
            String tempSEmail = inFile.next();
            Student tempStudent = new Student(tempSFirst, tempSLast, tempGrade, tempSEmail);
            stuList.add(tempStudent);
        }
        
        
        //test arraylist
        /*for(Teacher t: teachList){
            System.out.println(t.getEmail());
        }*/
        
        
        //beginning of logging in
        /*Scanner input = new Scanner(System.in);
        String email = input.nextLine();*/
        
        
        
    }
        
    //Stuff I don't completely understand that was put here automatically
    /*private Runner() {
    }
    
    public static Runner getInstance() {
        return RunnerHolder.INSTANCE;
    }
    
    private static class RunnerHolder {

        private static final Runner INSTANCE = new Runner();
    }*/
    
}

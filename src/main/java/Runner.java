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
        inFile.useDelimiter(",");
        inFile2.useDelimiter(",");
        
        //test arraylist
        System.out.println(inFile.next());
        System.out.println(inFile2.next());
        
        //creating teacher arraylist
        ArrayList<Teacher> teachList = new ArrayList<Teacher>();
        while(inFile2.hasNext()){
            String tempFirst = inFile2.next();
            String tempLast = inFile2.next();
            String tempEmail = inFile2.next();
            Teacher tempTeacher = new Teacher(tempFirst, tempLast, tempEmail);
            teachList.add(tempTeacher);
        }
        
        //test arraylist
        for(Teacher t: teachList){
            System.out.println(t.getEmail());
        }
        
        
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

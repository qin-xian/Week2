/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancolleage;

/**
 * A class to model students. Students can study. They hava a name and a ID.
 * @author Enzoq, 2020
 */
public class Student {
    // test 
    // test again for fetch
    private String name;
    private String studentID;
    private String program;
    
    /**
     * 
     * @param givenName - the student's name
     * @param givenID - the student's ID
     */
    public Student(String givenName, String givenID)
    {
        name = givenName;
        studentID = givenID;
    }
    /**
     * @param args the command line arguments
     */
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    /**
     * a method that returns true if a student studied and false otherwise.
     * @return whether or not the student studied
     */
    public boolean didStudy()
    {
        return true;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
            
}

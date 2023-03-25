/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_details;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Phea
 */
public class Course_Details {
//declaration of string arrays//
    private String[] courseCodes = {"DISD","DIWD","DIDM"};
    private String[] courseNames = {"Diploma in Software Development","Diploma in Web Development","Diploma in Data Metrics"};
    private String[] lecturers = {"Mr Jones","Mrs Smith","Mr Ntsinga"};
    
    //declaration of interger arrays//
    private int[] studentNumbers = {35,28,39};
    private int assignedVenues = ThreadLocalRandom.current().nextInt(1,4);
    
    //getters for the string array//        
    private String [] getCourseCodes() {
        return courseCodes;
    } 
    
    public String [] getCourseNames() {
        return courseNames;
    }
    public String [] getLecturers() {
        return lecturers;
    }
    //getters for int arrays//
    public int[] getStudentNumbers() {
        return studentNumbers;
    }
    public int getAssignedVenues() {
        return assignedVenues;
    }
    // setters for the String arrays//
    public void setCourseCodes(String[]printCourseCodes) {
        this.courseCodes = printCourseCodes;
    }
    public void setCourseNames(String[]printCourseNames) {
        this.courseNames = printCourseNames;
    }
    public void setLecturers(String[]printLecturers) {
        this.lecturers = printLecturers;
    }
    // setters for int arrays//
    public void setStudentNumbers(int[]printStudentNumbers) {
        this.studentNumbers = printStudentNumbers;
    }
    public void setAssignedVenues(int printAssignedVenues) {
        this.assignedVenues = printAssignedVenues;
    }
}

    
    
    


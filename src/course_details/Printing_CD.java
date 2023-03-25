/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_details;



import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.time.LocalDateTime;//importing local dateTime//
import javax.swing.JOptionPane;

// imported//
/**
 *
 * @author Phea
 */
public class Printing_CD {

    public static void main (String[] args) throws InterruptedException{ 
    boolean run = true;
    while (run) {
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        Course_Details detailPrint = new Course_Details();
        
        //prompt user for source code//
        int promptNumCode = (Integer.parseInt(JOptionPane.showInputDialog("Enter number(1-3) to view course details: " +"\n1- DISD" +"\n2- DIWD" + "\n3- DIDM")));
        
         
    //if statements for showing details//
    if (promptNumCode == 1) {
    System.out.println("Course Report: -   " + dtf.format(now) );
    System.out.println("**********************************");
    System.out.println("Course: -          " + detailPrint.getCourseNames()[0] );
    System.out.println("Student Number: -  " + detailPrint.getStudentNumbers()[0] );
    System.out.println("Lecturer : -       " + detailPrint.getLecturers()[0]) ;
    System.out.println("Venue: -           " + detailPrint.getAssignedVenues() );
    System.out.println("*********************************************" );
    Thread.sleep(2000);
    String promptContinue = JOptionPane.showInputDialog("Enter 'y' or 'Y' to view Report or any other character to continue:");
    if (promptContinue.equals("y") || promptContinue.equals("Y")){
        run= true;
    }
        else{
        System.exit(0);
        }
    }
    
    
    
    
    else if (promptNumCode == 2){ 
    System.out.println("Course Report: -  " + dtf.format(now) );
    System.out.println("**********************************");
    System.out.println("Course: -         " + detailPrint.getCourseNames()[0] );
    System.out.println("Student Number: - " + detailPrint.getStudentNumbers()[0] );
    System.out.println("Lecturer : -      " + detailPrint.getLecturers()[0]) ;
    System.out.println("Venue: -          " + detailPrint.getAssignedVenues() );
    System.out.println("*********************************************" );
    Thread.sleep(2000);
    String continueValue = JOptionPane.showInputDialog("Enter 'y' or 'Y' to view Report or any other character to continue:");
    if (continueValue.equals("y") || continueValue.equals("Y")){
        run= true;
    }
        else{
        System.exit(0);
   }
            
    
}
            else if (promptNumCode == 3);
    System.out.println("Course Report: - " + dtf.format(now) );
    System.out.println("**********************************");
    System.out.println("Course: -        " + detailPrint.getCourseNames()[0] );
    System.out.println("Student Number: -" + detailPrint.getStudentNumbers()[0] );
    System.out.println("Lecturer : -     " + detailPrint.getLecturers()[0]) ;
    System.out.println("Venue: -         " + detailPrint.getAssignedVenues() );
    System.out.println("*********************************************" );
    Thread.sleep(2000);
    String continueValue = JOptionPane.showInputDialog("Enter 'y' or 'Y' to view Report or any other character to continue:");
    if (continueValue.equals("y") || continueValue.equals("Y")){
        run= true;
    }
        else{
        System.exit(0);
        }
     }
    }
}
    
    



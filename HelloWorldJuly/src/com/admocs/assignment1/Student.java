package com.admocs.assignment1;

import java.util.Arrays;
import java.util.Date;

public class Student {
	
	private int id; //Instance Variable
	private String firstName;
	private String lastName;
	private Date dob;
	private float[] marks;
	private static int count;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		count++;
	}
	public Student(int id, String firstName, String lastName, Date dob, float[] marks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.marks = marks;
		count++;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", marks="
				+ Arrays.toString(marks) + "]";
	}
	
	
	
	
	public static int getCount() {
		return count;
	}
	public void result()
	{
		
		// Total possible marks for each subject
        float totalMarks = 100.0f;
        
        // Pass mark for each subject
        float passMark = 40.0f;
        
        // Calculate the total obtained marks
        float totalObtained = marks[0]+marks[1]+marks[2];
        
        // Calculate the percentage
        float percentage = (totalObtained / (totalMarks * 3)) * 100;
        
        // Check if the student has passed in all subjects
        boolean hasPassedAllSubjects = (marks[0] >= passMark) && (marks[1] >= passMark) && (marks[2] >= passMark);
        
        // Print the result
        System.out.println("Total Obtained Marks: " + totalObtained);
        System.out.println("Percentage: " + percentage + "%");
        if (hasPassedAllSubjects) {
            System.out.println("The student has passed in all subjects.");
         // Determine the grade based on the percentage
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else if (percentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("The student has not passed in all subjects.");
        }
	}
	
	

}

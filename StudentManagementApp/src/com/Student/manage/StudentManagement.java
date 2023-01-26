package com.Student.manage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Student.manage.StudentDao;
import com.Student.manage.Students_Class;

public class StudentManagement {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Student Management App");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true) {
    	   System.out.println("PRESS 1 to ADD Student");
           System.out.println("PRESS 2 to Delete Student");
           System.out.println("PRESS 3 to display Student");
           System.out.println("PRESS 4 to Exit App");
           int c=Integer.parseInt(br.readLine());
           
           if(c==1) {
        	   // add Student..
        	   System.out.println("Enter user name :");
        	   String name= br.readLine();
        	   
        	   System.out.println("Enter user phone :");
        	   String phone=br.readLine();
        	   
        	   System.out.println("Enter user city :");
        	   String city=br.readLine();
        	   
        	   // create student object to store Student
        	   Students_Class st=new Students_Class();
        	   boolean answer=StudentDao.insertStudentToDB(st);
        	   if(answer) {
        		   System.out.println("Student is added succesfully...");
        	   }else {
        		   System.out.println("Something went wrong try again...");
        	   }
        	   System.out.println(st);
        	 
           }else if(c==2) {
        	   // delete Student..
        	   
           }else if(c==3) {
        	   //display Student
           }else if(c==4) {
        	   // exit
        	   break;
           }else {
        	   
           }
          
           }
       System.out.println("Thankyou for using my application...");
       System.out.println("See you soon");
	}  

}
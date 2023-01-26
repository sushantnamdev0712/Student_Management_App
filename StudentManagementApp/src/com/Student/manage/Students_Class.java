package com.Student.manage;



public class Students_Class {
	
	 private int studentID;
     private String studentName;
     private String studentPhone;
     private String studentCity;
     
     public Students_Class(int studentID, String studentName, String studentPhone, String studentCity) {
    	 super();
    	 this.studentID = studentID;
    	 this.studentName = studentName;
    	 this.studentPhone = studentPhone;
    	 this.studentCity = studentCity;
    	 
     }
     public Students_Class(String studentName, String studentPhone, String studentCity) {
    	 super();
    	 
    	 this.studentName = studentName;
    	 this.studentPhone = studentPhone;
    	 this.studentCity = studentCity;
     }
	public Students_Class() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	
	@Override
	public String toString() {
		return "Students_Class [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone="
				+ studentPhone + ", studentCity=" + studentCity + "]";
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
     
     
}

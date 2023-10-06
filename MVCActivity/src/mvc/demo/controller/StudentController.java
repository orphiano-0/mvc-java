package mvc.demo.controller;
import mvc.demo.model.*;
import mvc.demo.view.*;
import java.util.*;


public class StudentController {
	  private StudentModel studentModel;
      private StudentView studentView;
      public static List<StudentModel> studentList = new ArrayList<>();
      static Iterator<StudentModel> iterator;
      public StudentController(StudentModel studentModel, StudentView studentView){
         this.studentModel = studentModel;
         this.studentView = studentView;
      }

      public void setStudentName(String name){
    	  studentModel.setName(name);
      }
      public String getStudentName(){
         return studentModel.getName();
      }
      public void setStudentRollNo(String rollNo){
    	  studentModel.setRollNo(rollNo);
      }
      public String getStudentRollNo(){
         return studentModel.getRollNo();
      }
      public void setStudentGender(String gender) {
    	  studentModel.setGender(gender);
      }
      public String getStudentGender() {
    	  return studentModel.getGender();
      }
      public void setStudentProgram(String program) {
    	  studentModel.setProgram(program);
      }
      public String getStudentProgram() {
    	  return studentModel.getProgram();
      }
      public void setStudentLevel(String level) {
    	  studentModel.setLevel(level);
      }
      public String getStudentLevel() {
    	  return studentModel.getLevel();
      }
      
      public void displayList(){
    	  iterator = studentList.iterator();
    	  while (iterator.hasNext()) {
    	  	StudentModel students = iterator.next();
    	  	String[] info = students.toString().split("");
    	  studentView.listDisplay(getStudentName(), getStudentRollNo(), getStudentGender(), getStudentProgram(), getStudentLevel());
    	  }
      }
      public void search(String rollNumber){
    	  boolean found = false;
    	  System.out.println("------------------------------------ ");
    	  iterator = studentList.iterator();
    	  	while (iterator.hasNext()){
    	  		StudentModel students = iterator.next();
    	  			if(students.getRollNo().equals(rollNumber)) {
    	  				String[] info = students.toString().split("");
    	  		studentView.listDisplay(getStudentName(), getStudentRollNo(), getStudentGender(), getStudentProgram(), getStudentLevel());
    	  	found = true;
    	  	}
    	  }
    	  
    	  if (found == false){
    		  System.out.println("No Record Found in the Students List. ");
    	  }
    	  System.out.println("------------------------------------ ");
    }
    	  public void deleteRecord(String rollNumber) {
    	  	boolean found = false;
    	  	System.out.println("------------------------------------");
    	  		iterator = studentList.iterator();
    	  			while (iterator.hasNext()){
    	  				StudentModel students = iterator.next();
    	  					if (students.getRollNo().equals(rollNumber)) {
    	  						iterator.remove();
    	  					found = true;
    	  				}
    	  }
    	  if (found == false) {
    	  	System.out.println("No Record Found in the Students List.");
    	  }
		  else {
    		System.out.println("The Record has been Successfully Deleted");
    	  }
    	  System.out.println("------------------------------------");
    }

}

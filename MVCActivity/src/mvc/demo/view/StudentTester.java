package mvc.demo.view;
import mvc.demo.model.*;
import java.util.*;
import mvc.demo.controller.*;


public class StudentTester {
	
	static Scanner input = new Scanner(System.in);
	static String name, rollNumber, gender, program, level;
	static StudentView view = new StudentView();
	static StudentModel model;
	static StudentController controller;
	
	 public static void main(String[] args) {
	 int choice;
	do {
	System.out.println("Select Option Below:");
	System.out.println("[0] - Terminate Program");
	System.out.println("[1] - Add Student ");
	System.out.println("[2] - View List of Students ");
	System.out.println("[3] - Search Student ");
	System.out.println("[4] - Delete Student");
	System.out.println("[5] - Update Student");
	System.out.print("\nEnter Your Choice: ");
	choice = input.nextInt();
	input.nextLine();
	controller = new StudentController(model, view);
	switch (choice){
	case 0:
	System.out.println("Thank You For Using Student Runner ");
	break;
	case 1:
	model = retrieveStudentFromDatabase();
	break;
	case 2:
	System.out.println("------------------------------------");
	controller.displayList();
	System.out.println("------------------------------------");
	break;
	case 3:
	System.out.println("Input Student's Roll Number to Search: ");
	System.out.print("- ");
	rollNumber = input.nextLine();
	controller.search(rollNumber);
	break;
	case 4:
	System.out.println(" Input Student's Roll Number to Delete:");
	System.out.print("-");
	rollNumber = input.nextLine();
	controller.deleteRecord(rollNumber);
	break;
	case 5:
	boolean found = false;
	System.out.println("Input Student's Roll Number to Update: ");
	System.out.print("- ");
	rollNumber = input.nextLine();
	System.out.println("++++++++++++++++++++++++++++++++++++++++ ");
	ListIterator <StudentModel> liStudent = controller.studentList.listIterator();
	while (liStudent.hasNext()){
	StudentModel students = liStudent.next();
	if (students.getRollNo().equals(rollNumber)){
	System.out.println("Input New Name: ");
	System.out.print("- ");
	name = input.nextLine();
	controller.setStudentName(name);
	System.out.println("Input New Roll Number: ");
	System.out.print(" - ");
	rollNumber = input.nextLine();
	controller.setStudentRollNo(rollNumber);
	System.out.println("Input New Gender: ");
	System.out.print("- " );
	gender = input.nextLine();
	controller.setStudentGender(gender);
	System.out.println("Input New Program: ");
	System.out.print(" - " );
	program = input.nextLine();
	controller.setStudentProgram(program);
	System.out.println(" Input New Year Level: ");
	System.out.print("- ");
	level = input.nextLine();
	controller.setStudentLevel(level);
	liStudent.set(new StudentModel());
		found = true;
	}
	}
	if (!found){
	System.out.println("No Record Found in the Students List. ");
	}else {
	System.out.println("The Record has been Successfully Updated");
	}
	break;
	}
	}while (choice != 0);
	 
	}
	private static StudentModel retrieveStudentFromDatabase() {
	StudentModel student = new StudentModel();
	System.out.println("Please Input the Student's Name: ");
	System.out.print(" - " );
	name = input.nextLine();
	student.setName(name);
	System.out.println("Please Input the Student's Roll Number: ");
	System.out.print("- " );
	rollNumber = input.nextLine();
	student.setRollNo(rollNumber);
	System.out.println("Please Input the Student's Gender: ");
	System.out.print("- ");
	gender = input.nextLine();
	student.setGender(gender);
	System.out.println("Please Input the Student's Program: ");
	System.out.print("- ");
	program = input.nextLine();
	student.setProgram(program);
	System.out.println("Please Input the Student's Year Level: ");
	System.out.print(" - ");
	level = input.nextLine();
	student.setLevel(level);
	controller.studentList.add(new StudentModel());
	return student;
	 }
}


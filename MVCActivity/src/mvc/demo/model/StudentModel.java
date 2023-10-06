package mvc.demo.model;

public class StudentModel {
	
    private String name, gender, program, level, rollNo;
    

	public void Student(String name, String rollNo, String gender, String program, String level) {
    	this.name = name;
    	this.rollNo = rollNo;
    	this.gender = gender;
    	this.program = program;
    	this.level = level;
    }
    
    public String getName() {
    	return name; 
	}
    public void setName(String name) {
    	this.name = name; 
	}
    public String getRollNo() {
    	return rollNo; 
	}
    public void setRollNo(String rollNo) {
    	this.rollNo = rollNo; 
	}
    public String getGender() {
    	return gender; 
	}
    public void setGender(String gender) {
    	this.gender = gender; 
	}
    public String getProgram() {
    	return program; 
	}
    public void setProgram(String program) {
    	this.program = program; 
	}
    public String getLevel() {
    	 return level;
    }
    public void setLevel(String yearLevel) {
    	this.level = yearLevel;
    }
    public String toString(){
    	return name+" " + rollNo + " " + gender + " " + program + " " + level;
    }
}

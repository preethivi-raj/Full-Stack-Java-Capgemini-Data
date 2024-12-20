package Collections;

public class Student implements Comparable<Student> {

	private int studentId;
	private String name ;
	private String subject;
	
	
	public Student(int studentId, String name, String subject) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.subject = subject;
	}
   

	public int getStudentId() {
		return studentId;
	}


	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}
 
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", subject=" + subject + "]";
	}

	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.studentId, o.studentId);
	}
	
	

}

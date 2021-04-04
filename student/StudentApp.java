package student;
import java.util.*;
/* User Interaction */
public class StudentApp {
	
	Student s;
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		StudentApp o=new StudentApp();
		
		
		
		Student s1=new Student("XYZ ABC","M","WE TI 17",65,256.0,6, 5400);
		Student s2=new Student("MPS ABA","F","WE TO 17",87,530.0,6, 5400);
		
		o.display(s1);
		o.display(s2);
		
	}
	
	
	
	
	public void display(Student s)
	{
		System.out.println("Student Details:\n"+s.getStudentName()
		+"\nRoll no: "+s.getRollno()+"\nGender: "+s.getStudentGender()
		+"\nMarks Obtained: "+s.getObtainedmarks()+" out of "+
		(s.getnosub()*100));
		if(s.getUpdateFees()==s.getFees())
			System.out.println("\nStudent has passed. "
					+ "No changes in fees viz "+s.getFees());
		else
			System.out.println("Student has failed. Previous fees: "
					+s.getFees()+" Updated Fees: "+s.getUpdateFees());
		
		
		System.out.println(s.getP()+" "+s.getPercent()+"\n\n");
		
	}
}
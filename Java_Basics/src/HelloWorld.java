import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	//static blocks
	static
	{
		System.out.println("im static block");
		Student.schoolName="St Anns";
		
	}
	//main method
	public static void main(String args[])
	{
		System.out.println("=================welcome students=============");
		Student s1=new Student();
		//s1.sid="101";
		s1.sname="supriya";
		s1.marks=200;
		/*
		 * static variables can be acccessed with object references but they should be
		 * accessed static way
		 */		
		//s1.schoolName="St Anns";
		//Student.schoolName="St Anns";
		
		//Student s2=new Student("102","Rahul",100);
		Student s2=new Student("Rahul",100);
		/*
		 * s2.sid="102"; s2.sname="Rahul"; s2.marks=100;
		 */
		//Student.schoolName="St Joseph";
		/*
		 * System.out.println("student id is: "+s2.sid);
		 * System.out.println("student name is: "+s2.sname);
		 * System.out.println("student marks are: "+s2.marks);
		 * System.out.println("student school name is: "+Student.schoolName);
		 */
	
		List<Student> students= new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		for(Student s: students)
		{
			System.out.println("hash code of student is: "+s);
			//System.out.println("student id is: "+s.sid);
			System.out.println("student id is: "+Student.sid);
			System.out.println("student name is: "+s.sname);
			System.out.println("student marks are: "+s.marks);
			System.out.println("student school name is: "+Student.schoolName);
		}
	}
}
class Student
{
	//static String sid="101";
	static Integer sid=101;
	String sname;
	double marks;
	static String schoolName;
	
	Student()
	{
		///System.out.println("im no-parameter student constructor");
		/*
		 * Integer studentId=Integer.parseInt(Student.sid)+1;
		 * Student.sid=studentId.toString();
		 */
		Student.sid++;
	}
	Student(String sname,double marks)
	{
		this.sname=sname;
		this.marks=marks;
	}
	Student(Integer sid,String sname,double marks)
	{
		Student.sid=Student.sid++;
		this.sname=sname;
		this.marks=marks;
	}
}

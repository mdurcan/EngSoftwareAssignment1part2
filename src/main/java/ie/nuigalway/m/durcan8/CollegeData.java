package ie.nuigalway.m.durcan8;

import java.util.Date;
import org.joda.time.DateTime;

public class CollegeData {

	public static void main(String args[]){
		
		//enter in students
		Student student1 = new Student("Dylan F",21,new Date(14/8/1995));
		Student student2 = new Student("Tara B",21,new Date(1/9/1995));
		Student student3 = new Student("Martin D",22,new Date(2/10/1994));
		Student student4 = new Student("Kieth Y",20,new Date(30/12/1995));
		Student student5 = new Student("Joe M",21,new Date(5/3/1995));
		
		//Create modules
		Module Module1 = new Module("programming","IT203");
		Module1.AddStudents(student1);
		Module1.AddStudents(student2);
		Module1.AddStudents(student3);
		Module1.AddStudents(student5);
		
		Module Module2 = new Module("SoftWare Engineering","IT301");
		Module2.AddStudents(student1);
		Module2.AddStudents(student4);
		Module2.AddStudents(student5);
		
		Module Module3 = new Module("Project Management","IT102");
		Module3.AddStudents(student1);
		Module3.AddStudents(student2);
		Module3.AddStudents(student3);
		Module3.AddStudents(student4);
		
		Module Module4 = new Module("Android Development","IT101");
		Module4.AddStudents(student2);
		Module4.AddStudents(student3);
		Module4.AddStudents(student4);
		Module4.AddStudents(student5);
		
		//Create Courses
		Course course = new Course("CT",new DateTime(1/9/2016),new DateTime(26/11/2016));
		course.AddModules(Module1);
		course.AddModules(Module2);
		course.AddModules(Module3);
		course.AddModules(Module4);
		
		System.out.println(course.GetCourseName()+ ":");
		
		for(final Module module : course.GetModules()){
			System.out.println("\t"+module.GetModuleName()+ ":");
			for(final Student student : module.GetStudents()){
				System.out.println( "\t\t"+student.GetName());
			}
		}
		
	}
}

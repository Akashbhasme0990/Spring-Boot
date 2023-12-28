package skye.sky;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import skye.sky.Entity.Student;
import skye.sky.Entity.User;
import skye.sky.dao.StudentDAO;
import skye.sky.dao.UserDAO;

import java.util.List;

@SpringBootApplication
@Configuration(enforceUniqueMethods = false)
public class SkyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SkyApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner commandLineRunner1(UserDAO userDAO){
//		return runner ->{createUser(userDAO);};
//	}
	private  String newStr(){
		return  "hello world";
	}

	private void createUser(UserDAO userDAO) {
		User tempUser= new User(123476,"akashbhasme9@gmail.com", "akash9", "sky@201", "imagess", "biooooo");
		userDAO.save(tempUser);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){
		return runner ->{
			createStudent(studentDAO);
			readStudent(studentDAO);
//			queryForStudents(studentDAO);
			queryForStudentsLastname(studentDAO);
////			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteMultipleRows(studentDAO);
		};
	}

	private void deleteMultipleRows(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numofRowsdeleted =studentDAO.deleteAll();
		System.out.println("deleted rows :" +numofRowsdeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId= 29;
		Student myStudent= studentDAO.getElementByid(studentId);
		studentDAO.delete(studentId);
		System.out.println("Student deleted sucessfully");
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId=29;
		System.out.println("getting student with Id: "+ studentId);
		Student myStudent=studentDAO.getElementByid(studentId);
		System.out.println("updating student name");
		myStudent.setLastname("scott");
		studentDAO.updateStudent(myStudent);
		System.out.println("Updated student "+ myStudent);
	}

	private void queryForStudentsLastname(StudentDAO studentDAO) {
		List<Student> theStudents=studentDAO.findByLastName("Bhasme");
		for(Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}
	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents=studentDAO.findAll();
		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}
	private void readStudent(StudentDAO studentDAO) {
		Student tempStudent= new Student("sky","Ss","@srgjiheth");
		studentDAO.save(tempStudent);
		int theid= tempStudent.getId();
		System.out.println("sgrg"+ theid);
		Student MyStudent= studentDAO.getElementByid(theid);
		System.out.println("required student"+ MyStudent);
	}
	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating the student object....");
		Student tempStudent =new Student("akash","Bhasme","akashbhasme09@gmail.com");
		Student tempStudent2 =new Student("akashsfdb","Bhasme","akashbhasme09@gmail.com");
		//save the student object
		System.out.println("saving the student....");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent2);
		//display the id of the saved student
		System.out.println("saved student.generated ifd: "+ tempStudent.getId());
	}

}

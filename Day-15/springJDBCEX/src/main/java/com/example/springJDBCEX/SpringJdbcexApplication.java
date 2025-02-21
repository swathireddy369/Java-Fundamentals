package com.example.springJDBCEX;

import com.example.springJDBCEX.model.Student;
import com.example.springJDBCEX.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcexApplication {

	public static void main(String[] args) {


		ApplicationContext context=SpringApplication.run(SpringJdbcexApplication.class, args);
		Student s=new Student();
		s.setMarks(34);
		s.setStudent_name("swas");
		s.setRollno(6);

		s.setMarks(34);
		s.setStudent_name("swas");
		s.setRollno(6);

		s.setMarks(34);
		s.setStudent_name("swas");
		s.setRollno(6);

		s.setMarks(78);
		s.setStudent_name("ana");
		s.setRollno(9);

		s.setMarks(89);
		s.setStudent_name("ana");
		s.setRollno(0);



		s.setMarks(89);
		s.setStudent_name("raji");
		s.setRollno(23);
		s.setMarks(89);
		s.setStudent_name("raji");
		s.setRollno(23);
		StudentService service=context.getBean(StudentService.class);
//		service.addStudent(s);
		service.getStudents();
	}

}

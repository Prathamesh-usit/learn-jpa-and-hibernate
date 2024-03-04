package com.usit.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.usit.springboot.learnjpaandhibernate.courseSpringDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired 
//	private CourseJdbcRepositry repositry;
	
//	@Autowired 
//	private CourseJpaRepository repositry;
	
	@Autowired
//	 @Qualifier("repositry")
	private CourseSpringDataJpaRepository repositry;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		repositry.save(new Course(1,"Learn AWS  ","in28minutes"));
		repositry.save(new Course(2,"Learn Azure prathamesh  ","in28minutes"));
		repositry.save(new Course(3,"Learn DevOps raut ","in28minutes"));
		repositry.save(new Course(4,"Learn SpringBoot  ","in28minutes"));
		repositry.save(new Course(5,"Learn MicroService  ","in28minutes"));
		repositry.save(new Course(6,"Learn Angular  ","in28minutes"));
		repositry.save(new Course(7,"Learn SpringJpa  ","in28minutes"));
//		repositry.delete();
//		repositry.deleteBy_ID(1l);
		
//		repositry.select(3);
		System.out.println(repositry.findById(3l));	
		System.out.println(repositry.findById(2l));
		System.out.println(repositry.findAll());
		System.out.println(repositry.count());
		System.out.println(repositry.findByAuthor("in28minutes"));
		System.out.println(repositry.findByAuthor(""));
		System.out.println(repositry.findByName("Learn AWS  "));
		System.out.println(repositry.findByName("Learn Azure prathamesh  "));
		repositry.deleteById(1l);
	}

}

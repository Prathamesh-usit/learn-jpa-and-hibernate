package com.usit.springboot.learnjpaandhibernate.Repositry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usit.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepositry {
	@Autowired
	 private JdbcTemplate springjdbcTemplate;
	 private static String INSERT_QUERY= 
			 """
	 			insert into course(id,name,author)
	 			values(?,?,?);
	 			
	 		""";
	 private static String delete_Query=
			 """
	 		delete from course where id=6;
	 		""";
	 private static String delete_Query_ById=
			 """
	 		delete from course where id=?;
	 		""";
	 private static String Select_Query_ById=
			 """
	 		select * from course 
	 		where id = ?;
	 		""";
	 
	  
	  public void delete() {
		  springjdbcTemplate.update(delete_Query);
	  }
	  public void deleteByID(long id) {
		  springjdbcTemplate.update(delete_Query_ById,id);
	  }
	  public Course select(long id) {
		// Course;
		  // result -> Bean -> Row Mapper  ->
		  // id 
		  return springjdbcTemplate.queryForObject(Select_Query_ById,
				  new BeanPropertyRowMapper<>(Course.class) ,id);
		  
	  }
	  
	  public void insert(Course course) {
		  springjdbcTemplate.update(INSERT_QUERY,
				  course.getId(),course.getName(),course.getAuthor() );
	  }
}

package com.usit.springboot.learnjpaandhibernate.courseSpringDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usit.springboot.learnjpaandhibernate.course.Course;
@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
//	List<Course> deleteBy_ID(long id);
//	public void deleteBy_ID(long id );
}

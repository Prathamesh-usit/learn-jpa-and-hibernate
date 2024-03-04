package com.usit.springboot.learnjpaandhibernate.CourseJpa;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.usit.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CourseJpaRepository {
	@PersistenceContext
//	@Autowired
 private EntityManager entityManager ;
 
 public void insert(Course course) {
	 entityManager.merge(course);
 }
 
 public Course findById(long id) {
	return entityManager.find(Course.class, id);
 }
// public void deleteBy_ID(long id ) {
//	 Course course = entityManager.find(Course.class, id);
//	  entityManager.remove(course);
//	
// }
 
 
 
 
 
 
 
}

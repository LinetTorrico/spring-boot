package com.dh.project.demoLynn.repository;

import com.dh.project.demoLynn.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jhonny on 6/10/17.
 */
public interface StudentRepository extends MongoRepository<Student, String> {
}

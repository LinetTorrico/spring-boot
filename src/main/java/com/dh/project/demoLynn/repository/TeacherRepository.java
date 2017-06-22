package com.dh.project.demoLynn.repository;

import com.dh.project.demoLynn.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.util.List;

/**
 * Created by Linet on 6/20/2017.
 */
public interface TeacherRepository extends MongoRepository<Teacher, String>  {


    @Query("{_id: ?0}")
    Teacher getTeacherById(String id);

}

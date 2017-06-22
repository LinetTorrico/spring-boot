package com.dh.project.demoLynn.service;

import com.dh.project.demoLynn.domain.Teacher;
import com.dh.project.demoLynn.repository.TeacherRepository;
import com.dh.project.demoLynn.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Linet on 6/21/17.
 */
@Service
public class TeacherService {
    // Injection
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        //TODO use repository
        /*
        List<Teacher> res = new ArrayList<>();

        res.add(new Teacher("jv", "Linet", 123456, "Ing Sistemas"));
        res.add(new Teacher("jv", "Britany", 123432, "NONE"));
        res.add(new Teacher("jv", "Stephany", 6434343, "Ing Sistemas"));
        res.add(new Teacher("jv", "Eduardo", 6434343, "Ing Sistemas"));
        */
        List<Teacher> res = teacherRepository.findAll();
        return res;
    }
    public Teacher getAllTeachersById(String id) {

        return teacherRepository.findOne(id);
    }
    public void addTeacher(TeacherController.TeacherRequestDTO newTeacherDTO){
        //TODO add into Database

        Teacher newTeacher = new Teacher();
        newTeacher.setCi(newTeacherDTO.getCi());
        newTeacher.setName(newTeacherDTO.getName());
        newTeacher.setProfesion(newTeacherDTO.getPrefession());
        newTeacher.setId(newTeacherDTO.getId());
        teacherRepository.save(newTeacher);

        System.out.println("the Name of teacher is --->" + newTeacher.getName()+"with id"+ newTeacher.getId());
    }
    public Teacher findByID(String id){
        return teacherRepository.getTeacherById(id);
    }

    public Teacher updateTeacherById(String id ,TeacherController.TeacherRequestDTO teacherDTO){
        Teacher newTeacher = new Teacher();
        newTeacher.setCi(teacherDTO.getCi());
        newTeacher.setProfesion(teacherDTO.getPrefession());
        newTeacher.setName(teacherDTO.getName());

        newTeacher.setId(id);
        teacherRepository.save(newTeacher);
        return newTeacher;
    }

    public Teacher deleteTeacherById(String id){
        Teacher response= teacherRepository.findOne(id);

        teacherRepository.delete(response);
        return response;
    }

    public void deleteTeacherByID(String id){
        teacherRepository.delete(id);
    }


}

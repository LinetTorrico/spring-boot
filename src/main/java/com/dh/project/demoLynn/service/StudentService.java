package com.dh.project.demoLynn.service;

import com.dh.project.demoLynn.domain.Student;
import com.dh.project.demoLynn.repository.StudentRepository;
import com.dh.project.demoLynn.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Linet on 6/21/17.
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public void addNewStudent(StudentController.StudentRequestDTO studentDTO){

        Student newStudent = new Student();
        newStudent.setCi(studentDTO.getCi());
        newStudent.setCodeSis(studentDTO.getCodeSis());
        newStudent.setName(studentDTO.getName());

        studentRepository.save(newStudent);
    }
}

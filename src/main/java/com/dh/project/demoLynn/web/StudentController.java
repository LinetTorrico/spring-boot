package com.dh.project.demoLynn.web;

import com.dh.project.demoLynn.domain.Student;
import com.dh.project.demoLynn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Linet on 6/21/17.
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addStudent(@RequestBody StudentRequestDTO student){

        studentService.addNewStudent(student);
    }
    //DTO
    public static class StudentRequestDTO{
        private String name;
        private Long ci;
        private Long codeSis;

        public String getName() {
            return name;
        }

        public Long getCi() {
            return ci;
        }

        public Long getCodeSis() {
            return codeSis;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCi(Long ci) {
            this.ci = ci;
        }

        public void setCodeSis(Long codeSis) {
            this.codeSis = codeSis;
        }
    }
}

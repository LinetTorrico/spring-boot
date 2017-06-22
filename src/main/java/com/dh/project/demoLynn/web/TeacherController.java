package com.dh.project.demoLynn.web;

import com.dh.project.demoLynn.domain.Teacher;
import com.dh.project.demoLynn.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by jhonny on 6/3/17.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        //teacherService = new TeacherService();

        return teacherService.getAllTeachers();

    }

    @RequestMapping(value = "{/id}", method = RequestMethod.GET)
    public Teacher getTeachersById(@PathVariable String id){
        return teacherService.getAllTeachersById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTeacher(@RequestBody TeacherRequestDTO newTeacher){

        teacherService.addTeacher(newTeacher);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Teacher updateTeacherById(@PathVariable String id, @RequestBody TeacherRequestDTO newTeacher) {
        return teacherService.updateTeacherById(id, newTeacher);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Teacher deleteTeacherById(@PathVariable String id) {
        return teacherService.deleteTeacherById(id);
    }

    public static class TeacherRequestDTO{
        private String name;
        private long ci;
        private String proffesion;
        private String id;

        public void setName(String name) {
            this.name = name;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public void setPrefession(String proffesion) {

            this.proffesion = proffesion;
        }

        public String getName() {
            return name;
        }

        public long getCi() {
            return ci;
        }

        public String getPrefession() {
            return proffesion;
        }
        public String getId() {
            return id;
        }
    }
}

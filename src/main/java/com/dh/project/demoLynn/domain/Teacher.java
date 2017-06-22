package com.dh.project.demoLynn.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Linet on 6/19/2017.
 */
@Document
public class Teacher {
    @Id
    private  String id;
    private  long ci;
    private  String profesion;
    private  String name;

    public Teacher(String id, long ci, String profesion, String name) {
        this.id = id;
        this.ci = ci;
        this.profesion = profesion;
        this.name = name;
    }
    public Teacher(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

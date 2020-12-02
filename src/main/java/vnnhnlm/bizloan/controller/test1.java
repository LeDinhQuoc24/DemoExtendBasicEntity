package vnnhnlm.bizloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vnnhnlm.bizloan.model.Student;
import vnnhnlm.bizloan.service.StudentServiceImpl;

import java.util.List;

@RestController
public class test1 {

    @Autowired
    private StudentServiceImpl service;

    @GetMapping(value = "student")
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

    @PostMapping(value = "create-student")
    public void createStudent(@RequestBody Student student) {
        service.save(student);
    }


}

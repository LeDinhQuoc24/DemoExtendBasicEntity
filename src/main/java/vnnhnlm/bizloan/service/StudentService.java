package vnnhnlm.bizloan.service;

import vnnhnlm.bizloan.model.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);

    List<Student> findAllStudents();
}

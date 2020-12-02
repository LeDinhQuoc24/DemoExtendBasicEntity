package vnnhnlm.bizloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vnnhnlm.bizloan.model.Student;
import vnnhnlm.bizloan.repository.StudentRepository;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void save(Student student) {
        student.setCreatedDate(new Date());
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}

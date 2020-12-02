package vnnhnlm.bizloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vnnhnlm.bizloan.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}

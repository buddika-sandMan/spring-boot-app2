package edu.icet.crm.service;

import edu.icet.crm.dto.Student;
import edu.icet.crm.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List<StudentEntity> getAllStudents();
}

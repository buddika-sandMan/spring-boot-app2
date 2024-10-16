package edu.icet.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Student;
import edu.icet.crm.entity.StudentEntity;
import edu.icet.crm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repository;

    @Override
    public void addStudent(Student student) {
        StudentEntity studentEntity = new ObjectMapper().convertValue(student, StudentEntity.class);
        System.out.println(studentEntity);
        repository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }
}

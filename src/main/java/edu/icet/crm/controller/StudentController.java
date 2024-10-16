package edu.icet.crm.controller;

import edu.icet.crm.dto.Student;
import edu.icet.crm.entity.StudentEntity;
import edu.icet.crm.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    //thi is use instead @Autowired - constructor injection
    final StudentService service;

    //No nee use this because already use the @RequiredArgsConstructor annotation
    //    StudentController(StudentService service) {
    //        this.service = service;
    //    }

    @PostMapping("/create")
    public Map<String, String> addStudent(@RequestBody Student student) {
        System.out.println(student);
        service.addStudent(student);
        return Collections.singletonMap("status","student created");
    }

    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

}

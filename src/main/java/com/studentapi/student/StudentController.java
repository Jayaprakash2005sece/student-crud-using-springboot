package com.studentapi.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    

   @GetMapping
    public List<Student> getStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping()
    public void addStudent(@RequestBody Student student) {
       studentService.insertStudent(student);
    }
    
    @GetMapping("/{id}")
    public Student getMethodName(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }
    
}

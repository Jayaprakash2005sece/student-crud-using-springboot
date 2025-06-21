package com.studentapi.student;

import java.util.List;

import org.hibernate.InvalidMappingException;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    private final  StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public void insertStudent(Student student) {
       studentRepository.save(student);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
            .orElseThrow(() -> new InvalidMappingException(null, null));
    }




    
}

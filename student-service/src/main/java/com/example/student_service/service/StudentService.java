// 2. Service: StudentService.java
package com.example.student_service.service;
import com.example.student_service.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {
    private final Map<Long, Student> studentStore = new ConcurrentHashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public Student addStudent(Student student) {
        long id = counter.getAndIncrement();
        student.setId(id);
        studentStore.put(id, student);
        return student;
    }

    public Optional<Student> getStudentById(Long id) {
        return Optional.ofNullable(studentStore.get(id));
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentStore.values());
    }
    public boolean deleteStudent(Long id) {
    return studentStore.remove(id) != null;
}
}
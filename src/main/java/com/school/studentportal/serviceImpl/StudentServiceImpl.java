package com.school.studentportal.serviceImpl;

import com.school.studentportal.service.StudentService;
import com.school.studentportal.entity.Student;
import com.school.studentportal.repository.StudentRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student, MultipartFile photo) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Page<Student> getStudentsPaginated(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> getStudentByStudentId(String studentId) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> getStudentByAdmissionNumber(String admissionNumber) {
        return Optional.empty();
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails, MultipartFile photo) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public List<Student> searchStudents(String query) {
        return List.of();
    }

    @Override
    public List<Student> findByClass(String className) {
        return List.of();
    }

    @Override
    public List<Student> findByParentPhone(String parentPhone) {
        return List.of();
    }

    @Override
    public String generateStudentId() {
        return "";
    }

    @Override
    public String generateAdmissionNumber() {
        return "";
    }

    @Override
    public long getTotalStudents() {
        return 0;
    }

    @Override
    public long getMaleStudentsCount() {
        return 0;
    }

    @Override
    public long getFemaleStudentsCount() {
        return 0;
    }

    @Override
    public List<Object[]> getStudentsByClass() {
        return List.of();
    }

    @Override
    public List<Student> getRecentStudents(int limit) {
        return List.of();
    }
}
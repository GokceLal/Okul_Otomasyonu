package org.example.repository;

import org.example.entity.Student;

public class StudentRepository extends RepositoryManager<Student,Long> {
    public StudentRepository(){
        super(new Student());
    }
}

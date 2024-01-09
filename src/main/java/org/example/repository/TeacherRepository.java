package org.example.repository;

import org.example.entity.Teacher;

public class TeacherRepository extends RepositoryManager<Teacher,Long> {
    public TeacherRepository(){
        super(new Teacher());
    }
}

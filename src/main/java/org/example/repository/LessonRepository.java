package org.example.repository;

import org.example.entity.Lesson;

public class LessonRepository extends RepositoryManager<Lesson,Long> {
    public LessonRepository(){
        super (new Lesson());
    }
}

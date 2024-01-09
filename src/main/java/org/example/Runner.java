package org.example;

import org.example.entity.Contact;
import org.example.entity.Lesson;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.repository.LessonRepository;
import org.example.repository.StudentRepository;

public class Runner {
    public static void main(String[] args) {

        Lesson lesson = new Lesson();
        lesson.setName("Matematik");
        //lesson.setTeacher(teacher);

        Contact contact = new Contact();
        contact.setCity("Eskisehir");
        contact.setZipcode("1234");
        contact.setPhone("055506");
        contact.setParent("Gokce");

        Student student = new Student();

        student.setName("Deniz");
        student.setSurname("Bektas");
        student.setContact(contact);
       // student.setLessonList();


        contact.setStudent(student);


        Teacher teacher = new Teacher();
        teacher.setName("Aslı");





        teacher.setLesson(lesson);
        new StudentRepository().save(student);
        new LessonRepository().save(lesson);

    }







}
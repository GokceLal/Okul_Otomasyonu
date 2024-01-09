package org.example;

import org.example.entity.Contact;
import org.example.entity.Student;
import org.example.repository.StudentRepository;

public class Runner {
    public static void main(String[] args) {


    }
    private static void ogrenciEkle(){

        Student student = Student.builder()
                .name("Deniz")
                .surname("Bektas")
                .build();
        Contact contact = Contact.builder()
                .city("Eskisehir")
                .zipcode("0203")
                .phone("0 555 666 77 88")
                .parent("Gokce")
                .build();



        contact.setStudent(student);
        new StudentRepository().save(student);
    }
}
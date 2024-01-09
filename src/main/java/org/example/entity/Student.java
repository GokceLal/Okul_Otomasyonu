package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_student")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name ="tbl_name")
    String name;
    @Column(name ="tbl_surname")
    String surname;


    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    Contact contact;
    @ManyToMany
    List<Lesson> lessonList;

}

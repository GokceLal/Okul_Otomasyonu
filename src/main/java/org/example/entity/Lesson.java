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
@Table(name = "tbl_lesson")
@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name ="tbl_name")
    String name;

    @OneToOne
    Teacher teacher;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "lessonList")
    List<Student> studentList;

}

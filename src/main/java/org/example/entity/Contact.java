package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_contact")
@Entity

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name ="tbl_city")
    String city;
    @Column(name ="tbl_zipcode")
    String zipcode;
    @Column(name ="tbl_phone")
    String phone;
    @Column(name ="tbl_parent")
    String parent;

    @OneToOne
    Student student;
}

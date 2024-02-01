package com.example.studentrecordmanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@jakarta.persistence.Entity
@Table(name="StudentData")
@Data
public class Entity{

    @Id
    @Column(name="Student_Id")
    Integer Student_Id;

    @Column(name="Name")
    String Name;

    @Column(name="Dept")
    String Dept;

    @Column(name="MobileNo")
    String MobileNo;

    @Column(name="Pointer")
    Integer Pointer;

}

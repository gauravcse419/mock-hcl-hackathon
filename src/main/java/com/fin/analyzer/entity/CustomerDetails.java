package com.fin.analyzer.entity;

import lombok.Data;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "customer_details")
@Data
public class CustomerDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    @Column
    private String name;
    @Column
    private String phoneNo;
    @Column
    private String emailId;
    @Column
    private Timestamp Date;


}
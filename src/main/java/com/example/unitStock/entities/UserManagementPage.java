package com.example.unitStock.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_management_page")
public class UserManagementPage {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="user_id")
 private int id;
 
 @Column(name="user_name")
 private String userName;
 

}

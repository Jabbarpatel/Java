package com.jpatel.test.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "password")
    private String password;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "role")
    private String role;

    UserEntity() {
    }

    UserEntity(String name, String password, LocalDateTime created_at, String role) {
        this.name = name;
        this.password = password;
        this.created_at = created_at;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.name = password;
    }

    public void setDateTime(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

package com.example.oci_microservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @PrePersist
    private void ensureId() {
        if (this.studentId == null) {
            this.studentId = (long) (10000 + Math.random() * 90000);
        }
    }

    /**
     * This method is called before the entity is persisted.
     * It ensures that the studentId is set to a randomly generated value
     * if it is not already assigned.
     */
    private String firstName;
    private String lastName;
    private String email;
}

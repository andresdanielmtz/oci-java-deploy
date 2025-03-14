package com.example.oci_microservice.model;

import com.example.utils.CustomIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {
    @Id
    private Long studentId;

    @PrePersist
    private void ensureId() {
        if (this.studentId == null) {
            this.studentId = CustomIdGenerator.generateRandomId();
        }
    }

    /**
     * This method is called before the entity is persisted.
     * It ensures that the studentId is set using the custom id generator
     * if it is not already assigned.
     */

    private String firstName;
    private String lastName;
    private String email;
    private String studentIdentification;
}
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

    /**
     * This method is called before the entity is persisted.
     * It ensures that the studentId is set to a randomly generated value
     * if it is not already assigned.
     */

    @PrePersist
    protected void onCreate() {
        if (this.studentId == null) {
            this.studentId = CustomIdGenerator.generateRandomId();
        }
    }


    private String firstName;
    private String lastName;
    private String email;
}

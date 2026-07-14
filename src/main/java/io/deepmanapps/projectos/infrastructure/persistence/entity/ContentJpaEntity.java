package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// Placeholder for an entity likely defined in another domain
@Entity
@Table(name = "content")
@Data
public class ContentJpaEntity {
    @Id
    private String contentId;
    private String description; // Example field
}

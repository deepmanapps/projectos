package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class ProductJpaEntity {
    @Id
    private String productId;

    private String productName;

    private String description;
}

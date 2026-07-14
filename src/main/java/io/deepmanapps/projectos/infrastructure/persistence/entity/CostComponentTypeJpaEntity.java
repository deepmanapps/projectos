package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cost_component_type")
@Data
public class CostComponentTypeJpaEntity {
    @Id
    private String costComponentTypeId;
}

package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cost_component_calc")
@Data
public class CostComponentCalcJpaEntity {
    @Id
    private String costComponentCalcId;
}

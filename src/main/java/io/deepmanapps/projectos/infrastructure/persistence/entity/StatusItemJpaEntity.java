package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "status_item")
@Data
public class StatusItemJpaEntity {
    @Id
    private String statusId;
}

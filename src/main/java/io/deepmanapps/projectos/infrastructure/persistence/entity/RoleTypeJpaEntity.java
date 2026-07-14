package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "role_type")
@Data
public class RoleTypeJpaEntity {
    @Id
    private String roleTypeId;
}

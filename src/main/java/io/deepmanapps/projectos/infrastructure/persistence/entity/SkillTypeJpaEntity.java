package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "skill_type")
@Data
public class SkillTypeJpaEntity {
    @Id
    private String skillTypeId;
}

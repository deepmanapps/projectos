package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_purpose_type")
@Data
public class WorkEffortPurposeTypeJpaEntity {

    @Id
    private String workEffortPurposeTypeId;

    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTypeId")
    private WorkEffortPurposeTypeJpaEntity parentType;
}

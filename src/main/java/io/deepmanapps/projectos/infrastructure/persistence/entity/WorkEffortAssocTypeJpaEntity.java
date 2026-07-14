package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_assoc_type")
@Data
public class WorkEffortAssocTypeJpaEntity {

    @Id
    private String workEffortAssocTypeId;

    private Boolean hasTable;

    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTypeId")
    private WorkEffortAssocTypeJpaEntity parentType;
}

package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_good_standard_type")
@Data
public class WorkEffortGoodStandardTypeJpaEntity {

    @Id
    private String workEffortGoodStdTypeId;

    private Boolean hasTable;

    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTypeId")
    private WorkEffortGoodStandardTypeJpaEntity parentType;
}

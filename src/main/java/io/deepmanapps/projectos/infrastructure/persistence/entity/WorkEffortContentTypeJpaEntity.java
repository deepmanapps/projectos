package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_content_type")
@Data
public class WorkEffortContentTypeJpaEntity {

    @Id
    private String workEffortContentTypeId;

    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTypeId")
    private WorkEffortContentTypeJpaEntity parentType;
}

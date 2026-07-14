package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_type_attr")
@Data
@IdClass(WorkEffortTypeAttrId.class)
public class WorkEffortTypeAttrJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortTypeId")
    private WorkEffortTypeJpaEntity workEffortType;

    @Id
    private String attrName;

    @Lob
    private String description;
}

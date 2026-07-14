package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_type_attr")
@Data
@IdClass(WorkEffortTypeAttrId.class)
public class WorkEffortTypeAttrJpaEntity {

    @Id
    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_type_id", insertable = false, updatable = false)
    private WorkEffortTypeJpaEntity workEffortType;

    @Lob
    private String description;
}

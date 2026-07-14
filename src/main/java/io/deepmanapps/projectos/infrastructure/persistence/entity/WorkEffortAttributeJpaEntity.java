package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_attribute")
@Data
@IdClass(WorkEffortAttributeId.class)
public class WorkEffortAttributeJpaEntity {

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @Column(name = "attr_value")
    private String attrValue;

    @Lob
    @Column(name = "attr_description")
    private String attrDescription;
}

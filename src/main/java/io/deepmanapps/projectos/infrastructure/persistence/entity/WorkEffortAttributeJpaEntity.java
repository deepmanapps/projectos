package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_attribute")
@Data
@IdClass(WorkEffortAttributeId.class)
public class WorkEffortAttributeJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Lob
    @Column(name = "attr_description")
    private String attrDescription;
}

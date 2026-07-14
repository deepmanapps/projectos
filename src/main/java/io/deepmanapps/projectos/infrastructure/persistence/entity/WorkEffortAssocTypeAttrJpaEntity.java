package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_assoc_type_attr")
@Data
@IdClass(WorkEffortAssocTypeAttrId.class)
public class WorkEffortAssocTypeAttrJpaEntity {

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortAssocTypeId")
    private WorkEffortAssocTypeJpaEntity workEffortAssocType;

    @Lob
    private String description;
}

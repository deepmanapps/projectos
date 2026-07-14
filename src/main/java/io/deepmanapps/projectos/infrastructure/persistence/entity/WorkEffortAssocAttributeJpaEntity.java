package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_assoc_attribute")
@Data
@IdClass(WorkEffortAssocAttributeId.class)
public class WorkEffortAssocAttributeJpaEntity {

    @Id
    @Column(name = "work_effort_id_from")
    private String workEffortIdFrom;

    @Id
    @Column(name = "work_effort_id_to")
    private String workEffortIdTo;

    @Id
    @Column(name = "work_effort_assoc_type_id")
    private String workEffortAssocTypeId;

    @Id
    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "work_effort_id_from", referencedColumnName = "work_effort_id_from", insertable = false, updatable = false),
            @JoinColumn(name = "work_effort_id_to", referencedColumnName = "work_effort_id_to", insertable = false, updatable = false),
            @JoinColumn(name = "work_effort_assoc_type_id", referencedColumnName = "work_effort_assoc_type_id", insertable = false, updatable = false),
            @JoinColumn(name = "from_date", referencedColumnName = "from_date", insertable = false, updatable = false)
    })
    private WorkEffortAssocJpaEntity workEffortAssoc;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_description")
    private String attrDescription;
}

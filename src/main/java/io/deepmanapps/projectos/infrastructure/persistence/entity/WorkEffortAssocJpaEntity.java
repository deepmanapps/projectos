package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "work_effort_assoc")
@Data
@IdClass(WorkEffortAssocId.class)
public class WorkEffortAssocJpaEntity {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id_from", referencedColumnName = "workEffortId", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffortFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id_to", referencedColumnName = "workEffortId", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffortTo;

    private Integer sequenceNum;
    private LocalDateTime thruDate;

    @OneToMany(mappedBy = "workEffortAssoc", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortAssocAttributeJpaEntity> attributes;
}

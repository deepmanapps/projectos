package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "work_effort_type")
@Data
public class WorkEffortTypeJpaEntity {

    @Id
    private String workEffortTypeId;

    private Boolean hasTable;

    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTypeId")
    private WorkEffortTypeJpaEntity parentType;

    @OneToMany(mappedBy = "workEffortTypeId")
    private List<WorkEffortJpaEntity> workEfforts;

    @OneToMany(mappedBy = "workEffortType")
    private List<WorkEffortTypeAttrJpaEntity> attributes;
}

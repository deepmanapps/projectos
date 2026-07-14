package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "work_effort_ical_data")
@Data
public class WorkEffortIcalDataJpaEntity {

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "work_effort_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffortJpaEntity workEffort;

    @Lob
    @Column(name = "ical_data")
    private String icalData;
}
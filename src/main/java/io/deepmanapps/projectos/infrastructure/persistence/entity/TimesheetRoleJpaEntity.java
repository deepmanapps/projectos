package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "timesheet_role")
@Data
@IdClass(TimesheetRoleId.class)
public class TimesheetRoleJpaEntity {

    @Id
    @Column(name = "timesheet_id")
    private String timesheetId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timesheet_id", insertable = false, updatable = false)
    private TimesheetJpaEntity timesheet;
}

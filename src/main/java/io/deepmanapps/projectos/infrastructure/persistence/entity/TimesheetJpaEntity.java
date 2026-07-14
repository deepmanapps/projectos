package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "timesheet")
@Data
public class TimesheetJpaEntity {

    @Id
    private String timesheetId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "client_party_id")
    private String clientPartyId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "approved_by_user_login_id")
    private String approvedByUserLoginId;

    @Lob
    private String comments;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    @OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimeEntryJpaEntity> timeEntries;

    @OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimesheetRoleJpaEntity> roles;
}

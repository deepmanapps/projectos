package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_party_assignment")
@Data
@IdClass(WorkEffortPartyAssignmentId.class)
public class WorkEffortPartyAssignmentJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partyId")
    private PartyJpaEntity party;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleTypeId")
    private RoleTypeJpaEntity roleType;

    @Id
    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
    private LocalDateTime statusDateTime;
    @Lob
    private String comments;
    private Boolean mustRsvp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignedByUserLoginId")
    private UserLoginJpaEntity assignedByUserLogin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId")
    private StatusItemJpaEntity status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expectationEnumId")
    private EnumerationJpaEntity expectationEnum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delegateReasonEnumId")
    private EnumerationJpaEntity delegateReasonEnum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facilityId")
    private FacilityJpaEntity facility;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "availabilityStatusId")
    private StatusItemJpaEntity availabilityStatus;
}

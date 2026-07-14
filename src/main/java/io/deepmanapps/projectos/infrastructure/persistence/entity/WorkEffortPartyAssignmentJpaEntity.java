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
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party_id", insertable = false, updatable = false)
    private PartyJpaEntity party;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_type_id", insertable = false, updatable = false)
    private RoleTypeJpaEntity roleType;

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

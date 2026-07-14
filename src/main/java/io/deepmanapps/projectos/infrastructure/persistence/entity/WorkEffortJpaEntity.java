package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "work_effort")
@Data
public class WorkEffortJpaEntity {

    @Id
    private String workEffortId;

    // ... (all other fields remain the same)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortParentId")
    private WorkEffortJpaEntity parent;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimeEntryJpaEntity> timeEntries;

    @OneToMany(mappedBy = "workEffortFrom", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortAssocJpaEntity> associationsFrom;

    @OneToMany(mappedBy = "workEffortTo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortAssocJpaEntity> associationsTo;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortAttributeJpaEntity> attributes;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortContentJpaEntity> contents;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortEventReminderJpaEntity> eventReminders;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortGoodStandardJpaEntity> goodStandards;

    @OneToOne(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private WorkEffortIcalDataJpaEntity icalData;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortCostCalcJpaEntity> costCalculations;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortKeywordJpaEntity> keywords;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortNoteJpaEntity> notes;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortPartyAssignmentJpaEntity> partyAssignments;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortReviewJpaEntity> reviews;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortSkillStandardJpaEntity> skillStandards;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortStatusJpaEntity> statusHistory;

    @OneToMany(mappedBy = "processWorkEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortTransBoxJpaEntity> transitionBoxes;

    @OneToMany(mappedBy = "workEffort", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortSurveyApplJpaEntity> surveyApplications;
    
    // --- All other scalar fields from before ---
    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;
    @Column(name = "work_effort_purpose_type_id")
    private String workEffortPurposeTypeId;
    @Column(name = "current_status_id")
    private String currentStatusId;
    @Column(name = "scope_enum_id")
    private String scopeEnumId;
    // ... and so on for all the other fields ...
}

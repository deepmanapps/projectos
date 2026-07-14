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

    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;
    @Column(name = "work_effort_purpose_type_id")
    private String workEffortPurposeTypeId;
    @Column(name = "current_status_id")
    private String currentStatusId;
    @Column(name = "scope_enum_id")
    private String scopeEnumId;
    @Column(name = "show_as_enum_id")
    private String showAsEnumId;
    @Column(name = "estimate_calc_method")
    private String estimateCalcMethod;
    @Column(name = "money_uom_id")
    private String moneyUomId;
    @Column(name = "universal_id")
    private String universalId;
    @Column(name = "source_reference_id")
    private String sourceReferenceId;
    @Column(name = "facility_id")
    private String facilityId;
    @Column(name = "info_url")
    private String infoUrl;
    @Column(name = "temp_expr_id")
    private String tempExprId;
    @Column(name = "runtime_data_id")
    private String runtimeDataId;
    @Column(name = "note_id")
    private String noteId;
    @Column(name = "service_loader_name")
    private String serviceLoaderName;
    @Column(name = "accommodation_map_id")
    private String accommodationMapId;
    @Column(name = "accommodation_spot_id")
    private String accommodationSpotId;
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @Column(name = "priority")
    private Integer priority;
    @Column(name = "percent_complete")
    private Integer percentComplete;
    @Column(name = "revision_number")
    private Integer revisionNumber;

    private Boolean sendNotificationEmail;

    @Column(name = "work_effort_name")
    private String workEffortName;
    @Lob
    private String description;
    @Lob
    private String locationDesc;
    @Lob
    private String specialTerms;

    private LocalDateTime lastStatusUpdate;
    private LocalDateTime estimatedStartDate;
    private LocalDateTime estimatedCompletionDate;
    private LocalDateTime actualStartDate;
    private LocalDateTime actualCompletionDate;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    private Double estimatedMilliSeconds;
    private Double estimatedSetupMillis;
    private Double actualMilliSeconds;
    private Double actualSetupMillis;
    private Double totalMilliSecondsAllowed;

    private BigDecimal totalMoneyAllowed;
    private BigDecimal quantityToProduce;
    private BigDecimal quantityProduced;
    private BigDecimal quantityRejected;
    private BigDecimal reservPersons;
    private BigDecimal reserv2ndPPPerc;
    private BigDecimal reservNthPPPerc;

    // Deprecated fields
    private Integer timeTransparency;
    private String fixedAssetId;
    private String recurrenceInfoId;

    // Relationships
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
}

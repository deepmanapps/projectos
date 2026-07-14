package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

    private Integer priority;

    private Integer percentComplete;

    private Integer revisionNumber;

    private Boolean sendNotificationEmail;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortParentId")
    private WorkEffortJpaEntity parent;

    // Deprecated fields from XML
    private Integer timeTransparency;
    private String fixedAssetId;
    private String recurrenceInfoId;
}

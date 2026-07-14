package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents a work effort, a central concept in the domain.
 * This is a pure domain model with no infrastructure dependencies.
 */
@Data
@Builder
public class WorkEffort {

    private String workEffortId;
    private String workEffortTypeId;
    private String workEffortPurposeTypeId;
    private String currentStatusId;
    private String scopeEnumId;
    private String showAsEnumId;
    private String estimateCalcMethod;
    private String moneyUomId;
    private String universalId;
    private String sourceReferenceId;
    private String facilityId;
    private String infoUrl;
    private String tempExprId;
    private String runtimeDataId;
    private String noteId;
    private String serviceLoaderName;
    private String accommodationMapId;
    private String accommodationSpotId;
    private String createdByUserLogin;
    private String lastModifiedByUserLogin;

    private Integer priority;
    private Integer percentComplete;
    private Integer revisionNumber;

    private Boolean sendNotificationEmail;

    private String workEffortName;
    private String description;
    private String locationDesc;
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

    // Relationships
    private WorkEffort parent;

    // Deprecated fields from XML
    private Integer timeTransparency;
    private String fixedAssetId;
    private String recurrenceInfoId;
}

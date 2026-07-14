package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffort;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortMapper {

    // Using @Lazy to break circular dependencies between mappers
    private final TimeEntryMapper timeEntryMapper;
    private final WorkEffortAssocMapper workEffortAssocMapper;
    private final WorkEffortAttributeMapper workEffortAttributeMapper;
    private final WorkEffortContentMapper workEffortContentMapper;
    private final WorkEffortEventReminderMapper workEffortEventReminderMapper;
    private final WorkEffortGoodStandardMapper workEffortGoodStandardMapper;
    private final WorkEffortIcalDataMapper workEffortIcalDataMapper;
    private final WorkEffortCostCalcMapper workEffortCostCalcMapper;
    private final WorkEffortKeywordMapper workEffortKeywordMapper;
    private final WorkEffortNoteMapper workEffortNoteMapper;
    private final WorkEffortPartyAssignmentMapper workEffortPartyAssignmentMapper;
    private final WorkEffortReviewMapper workEffortReviewMapper;
    private final WorkEffortSkillStandardMapper workEffortSkillStandardMapper;
    private final WorkEffortStatusMapper workEffortStatusMapper;
    private final WorkEffortTransBoxMapper workEffortTransBoxMapper;
    private final WorkEffortSurveyApplMapper workEffortSurveyApplMapper;

    public WorkEffort toDomain(WorkEffortJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffort.builder()
                .workEffortId(entity.getWorkEffortId())
                .workEffortTypeId(entity.getWorkEffortTypeId())
                .workEffortPurposeTypeId(entity.getWorkEffortPurposeTypeId())
                .currentStatusId(entity.getCurrentStatusId())
                .scopeEnumId(entity.getScopeEnumId())
                .showAsEnumId(entity.getShowAsEnumId())
                .estimateCalcMethod(entity.getEstimateCalcMethod())
                .moneyUomId(entity.getMoneyUomId())
                .universalId(entity.getUniversalId())
                .sourceReferenceId(entity.getSourceReferenceId())
                .facilityId(entity.getFacilityId())
                .infoUrl(entity.getInfoUrl())
                .tempExprId(entity.getTempExprId())
                .runtimeDataId(entity.getRuntimeDataId())
                .noteId(entity.getNoteId())
                .serviceLoaderName(entity.getServiceLoaderName())
                .accommodationMapId(entity.getAccommodationMapId())
                .accommodationSpotId(entity.getAccommodationSpotId())
                .createdByUserLogin(entity.getCreatedByUserLogin())
                .lastModifiedByUserLogin(entity.getLastModifiedByUserLogin())
                .priority(entity.getPriority())
                .percentComplete(entity.getPercentComplete())
                .revisionNumber(entity.getRevisionNumber())
                .sendNotificationEmail(entity.getSendNotificationEmail())
                .workEffortName(entity.getWorkEffortName())
                .description(entity.getDescription())
                .locationDesc(entity.getLocationDesc())
                .specialTerms(entity.getSpecialTerms())
                .lastStatusUpdate(entity.getLastStatusUpdate())
                .estimatedStartDate(entity.getEstimatedStartDate())
                .estimatedCompletionDate(entity.getEstimatedCompletionDate())
                .actualStartDate(entity.getActualStartDate())
                .actualCompletionDate(entity.getActualCompletionDate())
                .createdDate(entity.getCreatedDate())
                .lastModifiedDate(entity.getLastModifiedDate())
                .estimatedMilliSeconds(entity.getEstimatedMilliSeconds())
                .estimatedSetupMillis(entity.getEstimatedSetupMillis())
                .actualMilliSeconds(entity.getActualMilliSeconds())
                .actualSetupMillis(entity.getActualSetupMillis())
                .totalMilliSecondsAllowed(entity.getTotalMilliSecondsAllowed())
                .totalMoneyAllowed(entity.getTotalMoneyAllowed())
                .quantityToProduce(entity.getQuantityToProduce())
                .quantityProduced(entity.getQuantityProduced())
                .quantityRejected(entity.getQuantityRejected())
                .reservPersons(entity.getReservPersons())
                .reserv2ndPPPerc(entity.getReserv2ndPPPerc())
                .reservNthPPPerc(entity.getReservNthPPPerc())
                .timeTransparency(entity.getTimeTransparency())
                .fixedAssetId(entity.getFixedAssetId())
                .recurrenceInfoId(entity.getRecurrenceInfoId())
                .parent(toDomain(entity.getParent()))
                .timeEntries(entity.getTimeEntries() != null ? entity.getTimeEntries().stream().map(timeEntryMapper::toDomain).collect(Collectors.toList()) : null)
                .associationsFrom(entity.getAssociationsFrom() != null ? entity.getAssociationsFrom().stream().map(workEffortAssocMapper::toDomain).collect(Collectors.toList()) : null)
                .associationsTo(entity.getAssociationsTo() != null ? entity.getAssociationsTo().stream().map(workEffortAssocMapper::toDomain).collect(Collectors.toList()) : null)
                .attributes(entity.getAttributes() != null ? entity.getAttributes().stream().map(workEffortAttributeMapper::toDomain).collect(Collectors.toList()) : null)
                .contents(entity.getContents() != null ? entity.getContents().stream().map(workEffortContentMapper::toDomain).collect(Collectors.toList()) : null)
                .eventReminders(entity.getEventReminders() != null ? entity.getEventReminders().stream().map(workEffortEventReminderMapper::toDomain).collect(Collectors.toList()) : null)
                .goodStandards(entity.getGoodStandards() != null ? entity.getGoodStandards().stream().map(workEffortGoodStandardMapper::toDomain).collect(Collectors.toList()) : null)
                .icalData(workEffortIcalDataMapper.toDomain(entity.getIcalData()))
                .costCalculations(entity.getCostCalculations() != null ? entity.getCostCalculations().stream().map(workEffortCostCalcMapper::toDomain).collect(Collectors.toList()) : null)
                .keywords(entity.getKeywords() != null ? entity.getKeywords().stream().map(workEffortKeywordMapper::toDomain).collect(Collectors.toList()) : null)
                .notes(entity.getNotes() != null ? entity.getNotes().stream().map(workEffortNoteMapper::toDomain).collect(Collectors.toList()) : null)
                .partyAssignments(entity.getPartyAssignments() != null ? entity.getPartyAssignments().stream().map(workEffortPartyAssignmentMapper::toDomain).collect(Collectors.toList()) : null)
                .reviews(entity.getReviews() != null ? entity.getReviews().stream().map(workEffortReviewMapper::toDomain).collect(Collectors.toList()) : null)
                .skillStandards(entity.getSkillStandards() != null ? entity.getSkillStandards().stream().map(workEffortSkillStandardMapper::toDomain).collect(Collectors.toList()) : null)
                .statusHistory(entity.getStatusHistory() != null ? entity.getStatusHistory().stream().map(workEffortStatusMapper::toDomain).collect(Collectors.toList()) : null)
                .transitionBoxes(entity.getTransitionBoxes() != null ? entity.getTransitionBoxes().stream().map(workEffortTransBoxMapper::toDomain).collect(Collectors.toList()) : null)
                .surveyApplications(entity.getSurveyApplications() != null ? entity.getSurveyApplications().stream().map(workEffortSurveyApplMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortJpaEntity toEntity(WorkEffort domain) {
        if (domain == null) return null;
        WorkEffortJpaEntity entity = new WorkEffortJpaEntity();
        
        entity.setWorkEffortId(domain.getWorkEffortId());
        entity.setWorkEffortTypeId(domain.getWorkEffortTypeId());
        entity.setWorkEffortPurposeTypeId(domain.getWorkEffortPurposeTypeId());
        entity.setCurrentStatusId(domain.getCurrentStatusId());
        entity.setScopeEnumId(domain.getScopeEnumId());
        entity.setShowAsEnumId(domain.getShowAsEnumId());
        entity.setEstimateCalcMethod(domain.getEstimateCalcMethod());
        entity.setMoneyUomId(domain.getMoneyUomId());
        entity.setUniversalId(domain.getUniversalId());
        entity.setSourceReferenceId(domain.getSourceReferenceId());
        entity.setFacilityId(domain.getFacilityId());
        entity.setInfoUrl(domain.getInfoUrl());
        entity.setTempExprId(domain.getTempExprId());
        entity.setRuntimeDataId(domain.getRuntimeDataId());
        entity.setNoteId(domain.getNoteId());
        entity.setServiceLoaderName(domain.getServiceLoaderName());
        entity.setAccommodationMapId(domain.getAccommodationMapId());
        entity.setAccommodationSpotId(domain.getAccommodationSpotId());
        entity.setCreatedByUserLogin(domain.getCreatedByUserLogin());
        entity.setLastModifiedByUserLogin(domain.getLastModifiedByUserLogin());
        entity.setPriority(domain.getPriority());
        entity.setPercentComplete(domain.getPercentComplete());
        entity.setRevisionNumber(domain.getRevisionNumber());
        entity.setSendNotificationEmail(domain.getSendNotificationEmail());
        entity.setWorkEffortName(domain.getWorkEffortName());
        entity.setDescription(domain.getDescription());
        entity.setLocationDesc(domain.getLocationDesc());
        entity.setSpecialTerms(domain.getSpecialTerms());
        entity.setLastStatusUpdate(domain.getLastStatusUpdate());
        entity.setEstimatedStartDate(domain.getEstimatedStartDate());
        entity.setEstimatedCompletionDate(domain.getEstimatedCompletionDate());
        entity.setActualStartDate(domain.getActualStartDate());
        entity.setActualCompletionDate(domain.getActualCompletionDate());
        entity.setCreatedDate(domain.getCreatedDate());
        entity.setLastModifiedDate(domain.getLastModifiedDate());
        entity.setEstimatedMilliSeconds(domain.getEstimatedMilliSeconds());
        entity.setEstimatedSetupMillis(domain.getEstimatedSetupMillis());
        entity.setActualMilliSeconds(domain.getActualMilliSeconds());
        entity.setActualSetupMillis(domain.getActualSetupMillis());
        entity.setTotalMilliSecondsAllowed(domain.getTotalMilliSecondsAllowed());
        entity.setTotalMoneyAllowed(domain.getTotalMoneyAllowed());
        entity.setQuantityToProduce(domain.getQuantityToProduce());
        entity.setQuantityProduced(domain.getQuantityProduced());
        entity.setQuantityRejected(domain.getQuantityRejected());
        entity.setReservPersons(domain.getReservPersons());
        entity.setReserv2ndPPPerc(domain.getReserv2ndPPPerc());
        entity.setReservNthPPPerc(domain.getReservNthPPPerc());
        entity.setTimeTransparency(domain.getTimeTransparency());
        entity.setFixedAssetId(domain.getFixedAssetId());
        entity.setRecurrenceInfoId(domain.getRecurrenceInfoId());
        
        entity.setParent(toEntity(domain.getParent()));
        
        // Note: For collections, the mapping is often handled by the owning side of the relationship
        // to avoid infinite loops and ensure correctness, but we can set them here if needed,
        // ensuring the back-reference is also set on the child side.

        return entity;
    }
}

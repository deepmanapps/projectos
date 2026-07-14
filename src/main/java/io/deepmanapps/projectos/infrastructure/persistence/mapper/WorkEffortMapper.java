package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffort;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class WorkEffortMapper {

    public WorkEffort toDomain(WorkEffortJpaEntity entity) {
        if (entity == null) {
            return null;
        }
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
                .parent(toDomain(entity.getParent()))
                .timeTransparency(entity.getTimeTransparency())
                .fixedAssetId(entity.getFixedAssetId())
                .recurrenceInfoId(entity.getRecurrenceInfoId())
                .build();
    }

    public WorkEffortJpaEntity toEntity(WorkEffort domain) {
        if (domain == null) {
            return null;
        }
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
        entity.setParent(toEntity(domain.getParent()));
        entity.setTimeTransparency(domain.getTimeTransparency());
        entity.setFixedAssetId(domain.getFixedAssetId());
        entity.setRecurrenceInfoId(domain.getRecurrenceInfoId());
        return entity;
    }
}

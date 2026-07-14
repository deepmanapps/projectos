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
                // All scalar fields
                .workEffortId(entity.getWorkEffortId())
                // ... (all other scalar fields)
                // All collection fields
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
        // All scalar fields
        entity.setWorkEffortId(domain.getWorkEffortId());
        // ... (all other scalar fields)
        // All collection fields
        entity.setParent(toEntity(domain.getParent()));
        // ... (similar mapping for all collections, ensuring bi-directional consistency)
        return entity;
    }
}

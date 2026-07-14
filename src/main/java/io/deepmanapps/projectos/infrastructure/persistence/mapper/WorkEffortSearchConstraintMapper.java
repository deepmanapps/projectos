package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortSearchConstraint;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSearchConstraintJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortSearchConstraintMapper {

    private final WorkEffortSearchResultMapper searchResultMapper;

    public WorkEffortSearchConstraint toDomain(WorkEffortSearchConstraintJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortSearchConstraint.builder()
                .constraintSeqId(entity.getConstraintSeqId())
                .constraintName(entity.getConstraintName())
                .infoString(entity.getInfoString())
                .includeSubWorkEfforts(entity.getIncludeSubWorkEfforts())
                .isAnd(entity.getIsAnd())
                .anyPrefix(entity.getAnyPrefix())
                .anySuffix(entity.getAnySuffix())
                .removeStems(entity.getRemoveStems())
                .lowValue(entity.getLowValue())
                .highValue(entity.getHighValue())
                .workEffortSearchResult(searchResultMapper.toDomain(entity.getWorkEffortSearchResult()))
                .build();
    }

    public WorkEffortSearchConstraintJpaEntity toEntity(WorkEffortSearchConstraint domain) {
        if (domain == null) return null;
        WorkEffortSearchConstraintJpaEntity entity = new WorkEffortSearchConstraintJpaEntity();
        entity.setConstraintSeqId(domain.getConstraintSeqId());
        entity.setConstraintName(domain.getConstraintName());
        entity.setInfoString(domain.getInfoString());
        entity.setIncludeSubWorkEfforts(domain.getIncludeSubWorkEfforts());
        entity.setIsAnd(domain.getIsAnd());
        entity.setAnyPrefix(domain.getAnyPrefix());
        entity.setAnySuffix(domain.getAnySuffix());
        entity.setRemoveStems(domain.getRemoveStems());
        entity.setLowValue(domain.getLowValue());
        entity.setHighValue(domain.getHighValue());
        entity.setWorkEffortSearchResult(searchResultMapper.toEntity(domain.getWorkEffortSearchResult()));
        return entity;
    }
}

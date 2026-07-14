package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortSearchResult;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSearchResultJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class WorkEffortSearchResultMapper {

    private final WorkEffortSearchConstraintMapper constraintMapper;

    public WorkEffortSearchResult toDomain(WorkEffortSearchResultJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortSearchResult.builder()
                .workEffortSearchResultId(entity.getWorkEffortSearchResultId())
                .visitId(entity.getVisitId())
                .orderByName(entity.getOrderByName())
                .isAscending(entity.getIsAscending())
                .numResults(entity.getNumResults())
                .secondsTotal(entity.getSecondsTotal())
                .searchDate(entity.getSearchDate())
                .constraints(entity.getConstraints() != null ? entity.getConstraints().stream().map(constraintMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public WorkEffortSearchResultJpaEntity toEntity(WorkEffortSearchResult domain) {
        if (domain == null) return null;
        WorkEffortSearchResultJpaEntity entity = new WorkEffortSearchResultJpaEntity();
        entity.setWorkEffortSearchResultId(domain.getWorkEffortSearchResultId());
        entity.setVisitId(domain.getVisitId());
        entity.setOrderByName(domain.getOrderByName());
        entity.setIsAscending(domain.getIsAscending());
        entity.setNumResults(domain.getNumResults());
        entity.setSecondsTotal(domain.getSecondsTotal());
        entity.setSearchDate(domain.getSearchDate());
        if (domain.getConstraints() != null) {
            entity.setConstraints(domain.getConstraints().stream().map(constraintMapper::toEntity).collect(Collectors.toList()));
            entity.getConstraints().forEach(c -> c.setWorkEffortSearchResult(entity));
        }
        return entity;
    }
}

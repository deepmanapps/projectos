package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortKeyword;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortKeywordJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortKeywordMapper {

    private final WorkEffortMapper workEffortMapper;

    public WorkEffortKeyword toDomain(WorkEffortKeywordJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortKeyword.builder()
                .keyword(entity.getKeyword())
                .relevancyWeight(entity.getRelevancyWeight())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .build();
    }

    public WorkEffortKeywordJpaEntity toEntity(WorkEffortKeyword domain) {
        if (domain == null) return null;
        WorkEffortKeywordJpaEntity entity = new WorkEffortKeywordJpaEntity();
        entity.setKeyword(domain.getKeyword());
        entity.setRelevancyWeight(domain.getRelevancyWeight());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        return entity;
    }
}

package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortContent;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortContentJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortContentMapper {

    private final WorkEffortMapper workEffortMapper;
    private final ContentMapper contentMapper;
    private final WorkEffortContentTypeMapper workEffortContentTypeMapper;

    public WorkEffortContent toDomain(WorkEffortContentJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortContent.builder()
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .content(contentMapper.toDomain(entity.getContent()))
                .workEffortContentType(workEffortContentTypeMapper.toDomain(entity.getWorkEffortContentType()))
                .build();
    }

    public WorkEffortContentJpaEntity toEntity(WorkEffortContent domain) {
        if (domain == null) return null;
        WorkEffortContentJpaEntity entity = new WorkEffortContentJpaEntity();
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setContent(contentMapper.toEntity(domain.getContent()));
        entity.setWorkEffortContentType(workEffortContentTypeMapper.toEntity(domain.getWorkEffortContentType()));
        return entity;
    }
}

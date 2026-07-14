package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortAttribute;
import io.deepmanapps.projectos.domain.port.out.WorkEffortAttributeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortAttributeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortAttributeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class WorkEffortAttributeRepositoryAdapter implements WorkEffortAttributeRepository {

    private final WorkEffortAttributeJpaRepository jpaRepository;
    private final WorkEffortAttributeMapper mapper;

    @Override
    public WorkEffortAttribute save(WorkEffortAttribute attribute) {
        var entity = mapper.toEntity(attribute);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<WorkEffortAttribute> findByWorkEffortId(String workEffortId) {
        return jpaRepository.findByWorkEffort_WorkEffortId(workEffortId).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

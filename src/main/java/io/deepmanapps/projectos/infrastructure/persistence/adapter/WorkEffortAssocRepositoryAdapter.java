package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortAssoc;
import io.deepmanapps.projectos.domain.port.out.WorkEffortAssocRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortAssocMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortAssocJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocRepositoryAdapter implements WorkEffortAssocRepository {

    private final WorkEffortAssocJpaRepository jpaRepository;
    private final WorkEffortAssocMapper mapper;

    @Override
    public WorkEffortAssoc save(WorkEffortAssoc workEffortAssoc) {
        var entity = mapper.toEntity(workEffortAssoc);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<WorkEffortAssoc> findByWorkEffortIdFrom(String workEffortId) {
        return jpaRepository.findByWorkEffortFrom_WorkEffortId(workEffortId).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public List<WorkEffortAssoc> findByWorkEffortIdTo(String workEffortId) {
        return jpaRepository.findByWorkEffortTo_WorkEffortId(workEffortId).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

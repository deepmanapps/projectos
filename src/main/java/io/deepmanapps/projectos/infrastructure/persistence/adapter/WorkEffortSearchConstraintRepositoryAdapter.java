package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortSearchConstraint;
import io.deepmanapps.projectos.domain.port.out.WorkEffortSearchConstraintRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortSearchConstraintMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortSearchConstraintJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortSearchConstraintRepositoryAdapter implements WorkEffortSearchConstraintRepository {

    private final WorkEffortSearchConstraintJpaRepository jpaRepository;
    private final WorkEffortSearchConstraintMapper mapper;

    @Override
    public WorkEffortSearchConstraint save(WorkEffortSearchConstraint constraint) {
        var entity = mapper.toEntity(constraint);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

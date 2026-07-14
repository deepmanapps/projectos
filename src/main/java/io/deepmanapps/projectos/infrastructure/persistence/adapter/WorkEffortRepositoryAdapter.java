package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffort;
import io.deepmanapps.projectos.domain.port.out.WorkEffortRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortRepositoryAdapter implements WorkEffortRepository {

    private final WorkEffortJpaRepository workEffortJpaRepository;
    private final WorkEffortMapper workEffortMapper;

    @Override
    public Optional<WorkEffort> findById(String workEffortId) {
        return workEffortJpaRepository.findById(workEffortId)
                .map(workEffortMapper::toDomain);
    }

    @Override
    public WorkEffort save(WorkEffort workEffort) {
        var entity = workEffortMapper.toEntity(workEffort);
        var savedEntity = workEffortJpaRepository.save(entity);
        return workEffortMapper.toDomain(savedEntity);
    }
}

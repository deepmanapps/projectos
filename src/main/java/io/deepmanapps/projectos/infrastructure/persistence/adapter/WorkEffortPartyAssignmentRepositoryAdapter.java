package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortPartyAssignment;
import io.deepmanapps.projectos.domain.port.out.WorkEffortPartyAssignmentRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortPartyAssignmentMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortPartyAssignmentJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortPartyAssignmentRepositoryAdapter implements WorkEffortPartyAssignmentRepository {

    private final WorkEffortPartyAssignmentJpaRepository jpaRepository;
    private final WorkEffortPartyAssignmentMapper mapper;

    @Override
    public WorkEffortPartyAssignment save(WorkEffortPartyAssignment assignment) {
        var entity = mapper.toEntity(assignment);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

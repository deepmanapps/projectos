package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortPurposeType;
import io.deepmanapps.projectos.domain.port.out.WorkEffortPurposeTypeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortPurposeTypeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortPurposeTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortPurposeTypeRepositoryAdapter implements WorkEffortPurposeTypeRepository {

    private final WorkEffortPurposeTypeJpaRepository jpaRepository;
    private final WorkEffortPurposeTypeMapper mapper;

    @Override
    public Optional<WorkEffortPurposeType> findById(String id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public WorkEffortPurposeType save(WorkEffortPurposeType purposeType) {
        var entity = mapper.toEntity(purposeType);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocAttribute;
import io.deepmanapps.projectos.domain.port.out.WorkEffortAssocAttributeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortAssocAttributeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortAssocAttributeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocAttributeRepositoryAdapter implements WorkEffortAssocAttributeRepository {

    private final WorkEffortAssocAttributeJpaRepository jpaRepository;
    private final WorkEffortAssocAttributeMapper mapper;

    @Override
    public WorkEffortAssocAttribute save(WorkEffortAssocAttribute attribute) {
        var entity = mapper.toEntity(attribute);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<WorkEffortAssocAttribute> findByWorkEffortAssocId(String workEffortIdFrom, String workEffortIdTo, String assocTypeId, LocalDateTime fromDate) {
        return jpaRepository.findByWorkEffortIdFromAndWorkEffortIdToAndWorkEffortAssocTypeIdAndFromDate(workEffortIdFrom, workEffortIdTo, assocTypeId, fromDate)
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

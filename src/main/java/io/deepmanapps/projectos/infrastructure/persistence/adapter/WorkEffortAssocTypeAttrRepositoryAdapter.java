package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocTypeAttr;
import io.deepmanapps.projectos.domain.port.out.WorkEffortAssocTypeAttrRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortAssocTypeAttrMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortAssocTypeAttrJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocTypeAttrRepositoryAdapter implements WorkEffortAssocTypeAttrRepository {

    private final WorkEffortAssocTypeAttrJpaRepository jpaRepository;
    private final WorkEffortAssocTypeAttrMapper mapper;

    @Override
    public WorkEffortAssocTypeAttr save(WorkEffortAssocTypeAttr attribute) {
        var entity = mapper.toEntity(attribute);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<WorkEffortAssocTypeAttr> findByAssocTypeId(String assocTypeId) {
        return jpaRepository.findByWorkEffortAssocType_WorkEffortAssocTypeId(assocTypeId).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

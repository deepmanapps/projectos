package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortIcalData;
import io.deepmanapps.projectos.domain.port.out.WorkEffortIcalDataRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortIcalDataMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortIcalDataJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortIcalDataRepositoryAdapter implements WorkEffortIcalDataRepository {

    private final WorkEffortIcalDataJpaRepository jpaRepository;
    private final WorkEffortIcalDataMapper mapper;

    @Override
    public WorkEffortIcalData save(WorkEffortIcalData icalData) {
        var entity = mapper.toEntity(icalData);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

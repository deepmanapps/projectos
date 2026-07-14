package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortCostCalc;
import io.deepmanapps.projectos.domain.port.out.WorkEffortCostCalcRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortCostCalcMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortCostCalcJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortCostCalcRepositoryAdapter implements WorkEffortCostCalcRepository {

    private final WorkEffortCostCalcJpaRepository jpaRepository;
    private final WorkEffortCostCalcMapper mapper;

    @Override
    public WorkEffortCostCalc save(WorkEffortCostCalc costCalc) {
        var entity = mapper.toEntity(costCalc);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

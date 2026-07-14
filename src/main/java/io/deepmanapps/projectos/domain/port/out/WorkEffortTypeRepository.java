package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortType;
import java.util.Optional;

public interface WorkEffortTypeRepository {
    Optional<WorkEffortType> findById(String id);
    WorkEffortType save(WorkEffortType type);
}

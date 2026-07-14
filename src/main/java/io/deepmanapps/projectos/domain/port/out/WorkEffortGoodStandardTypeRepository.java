package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortGoodStandardType;
import java.util.Optional;

public interface WorkEffortGoodStandardTypeRepository {
    Optional<WorkEffortGoodStandardType> findById(String id);
    WorkEffortGoodStandardType save(WorkEffortGoodStandardType type);
}

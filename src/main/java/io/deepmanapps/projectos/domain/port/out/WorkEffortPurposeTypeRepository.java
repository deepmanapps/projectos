package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortPurposeType;
import java.util.Optional;

public interface WorkEffortPurposeTypeRepository {
    Optional<WorkEffortPurposeType> findById(String id);
    WorkEffortPurposeType save(WorkEffortPurposeType purposeType);
}

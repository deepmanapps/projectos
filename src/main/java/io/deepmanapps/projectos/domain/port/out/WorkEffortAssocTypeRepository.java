package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocType;
import java.util.Optional;

public interface WorkEffortAssocTypeRepository {
    Optional<WorkEffortAssocType> findById(String id);
    WorkEffortAssocType save(WorkEffortAssocType workEffortAssocType);
}

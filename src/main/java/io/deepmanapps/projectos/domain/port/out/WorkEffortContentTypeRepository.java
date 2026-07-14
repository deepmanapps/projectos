package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortContentType;
import java.util.Optional;

public interface WorkEffortContentTypeRepository {
    Optional<WorkEffortContentType> findById(String id);
    WorkEffortContentType save(WorkEffortContentType contentType);
}

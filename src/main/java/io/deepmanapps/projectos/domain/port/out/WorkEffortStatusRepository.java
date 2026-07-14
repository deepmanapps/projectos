package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortStatus;

public interface WorkEffortStatusRepository {
    WorkEffortStatus save(WorkEffortStatus status);
}

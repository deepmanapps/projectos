package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortTransBox;

public interface WorkEffortTransBoxRepository {
    WorkEffortTransBox save(WorkEffortTransBox transBox);
}

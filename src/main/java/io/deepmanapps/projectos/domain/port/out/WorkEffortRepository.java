package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffort;

import java.util.Optional;

/**
 * Driven port for work effort persistence.
 */
public interface WorkEffortRepository {

    Optional<WorkEffort> findById(String workEffortId);

    WorkEffort save(WorkEffort workEffort);
}

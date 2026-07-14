package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortSearchConstraint;

public interface WorkEffortSearchConstraintRepository {
    WorkEffortSearchConstraint save(WorkEffortSearchConstraint constraint);
}

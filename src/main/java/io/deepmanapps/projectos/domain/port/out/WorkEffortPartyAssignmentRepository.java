package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortPartyAssignment;

public interface WorkEffortPartyAssignmentRepository {
    WorkEffortPartyAssignment save(WorkEffortPartyAssignment assignment);
}

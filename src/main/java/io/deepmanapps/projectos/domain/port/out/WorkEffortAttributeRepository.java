package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortAttribute;
import java.util.List;

public interface WorkEffortAttributeRepository {
    WorkEffortAttribute save(WorkEffortAttribute attribute);
    List<WorkEffortAttribute> findByWorkEffortId(String workEffortId);
}

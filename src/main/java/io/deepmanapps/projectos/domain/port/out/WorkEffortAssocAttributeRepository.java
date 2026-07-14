package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocAttribute;
import java.util.List;

public interface WorkEffortAssocAttributeRepository {
    WorkEffortAssocAttribute save(WorkEffortAssocAttribute attribute);
    List<WorkEffortAssocAttribute> findByWorkEffortAssocId(String workEffortIdFrom, String workEffortIdTo, String assocTypeId, java.time.LocalDateTime fromDate);
}

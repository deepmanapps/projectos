package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortAssoc;
import java.util.List;

public interface WorkEffortAssocRepository {
    WorkEffortAssoc save(WorkEffortAssoc workEffortAssoc);
    List<WorkEffortAssoc> findByWorkEffortIdFrom(String workEffortId);
    List<WorkEffortAssoc> findByWorkEffortIdTo(String workEffortId);
}

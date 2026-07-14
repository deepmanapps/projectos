package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocTypeAttr;
import java.util.List;

public interface WorkEffortAssocTypeAttrRepository {
    WorkEffortAssocTypeAttr save(WorkEffortAssocTypeAttr attribute);
    List<WorkEffortAssocTypeAttr> findByAssocTypeId(String assocTypeId);
}

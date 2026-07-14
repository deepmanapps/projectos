package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortContent;

public interface WorkEffortContentRepository {
    WorkEffortContent save(WorkEffortContent workEffortContent);
}

package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortSearchResult;
import java.util.Optional;

public interface WorkEffortSearchResultRepository {
    Optional<WorkEffortSearchResult> findById(String id);
    WorkEffortSearchResult save(WorkEffortSearchResult searchResult);
}

package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortNote;

public interface WorkEffortNoteRepository {
    WorkEffortNote save(WorkEffortNote note);
}

package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortEventReminder;

public interface WorkEffortEventReminderRepository {
    WorkEffortEventReminder save(WorkEffortEventReminder reminder);
}

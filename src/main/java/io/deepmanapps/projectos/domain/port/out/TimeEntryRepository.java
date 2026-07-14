package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.TimeEntry;

import java.util.Optional;

/**
 * Driven port for time entry persistence.
 */
public interface TimeEntryRepository {

    Optional<TimeEntry> findById(String timeEntryId);

    TimeEntry save(TimeEntry timeEntry);
}

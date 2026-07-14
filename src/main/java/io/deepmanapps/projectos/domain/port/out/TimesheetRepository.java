package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.Timesheet;

import java.util.Optional;

/**
 * Driven port for timesheet persistence.
 */
public interface TimesheetRepository {

    Optional<Timesheet> findById(String timesheetId);

    Timesheet save(Timesheet timesheet);
}

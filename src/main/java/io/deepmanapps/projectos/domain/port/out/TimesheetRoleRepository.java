package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.TimesheetRole;
import java.util.List;

public interface TimesheetRoleRepository {
    TimesheetRole save(TimesheetRole timesheetRole);
    List<TimesheetRole> findByTimesheetId(String timesheetId);
}

package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortIcalData;

public interface WorkEffortIcalDataRepository {
    WorkEffortIcalData save(WorkEffortIcalData icalData);
}

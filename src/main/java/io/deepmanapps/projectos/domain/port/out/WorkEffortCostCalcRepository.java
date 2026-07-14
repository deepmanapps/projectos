package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortCostCalc;

public interface WorkEffortCostCalcRepository {
    WorkEffortCostCalc save(WorkEffortCostCalc costCalc);
}

package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortIcalData {
    private String icalData;
    private WorkEffort workEffort;
}

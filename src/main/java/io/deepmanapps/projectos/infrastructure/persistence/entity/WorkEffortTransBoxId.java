package io.deepmanapps.projectos.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkEffortTransBoxId implements Serializable {
    private String processWorkEffort;
    private String toActivityId;
    private String transitionId;
}

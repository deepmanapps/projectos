package io.deepmanapps.projectos.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkEffortAttributeId implements Serializable {
    private String workEffort; // Corresponds to the workEffort field in the entity
    private String attrName;
}

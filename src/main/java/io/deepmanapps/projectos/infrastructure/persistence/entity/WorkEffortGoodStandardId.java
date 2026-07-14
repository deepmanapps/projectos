package io.deepmanapps.projectos.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkEffortGoodStandardId implements Serializable {
    private String workEffort;
    private String product;
    private String workEffortGoodStdType;
    private LocalDateTime fromDate;
}

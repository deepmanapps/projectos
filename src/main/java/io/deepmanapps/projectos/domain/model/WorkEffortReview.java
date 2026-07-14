package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortReview {
    private LocalDateTime reviewDate;
    private Boolean postedAnonymous;
    private Double rating;
    private String reviewText;

    // Relationships
    private WorkEffort workEffort;
    private UserLogin userLogin;
    private StatusItem status;
}

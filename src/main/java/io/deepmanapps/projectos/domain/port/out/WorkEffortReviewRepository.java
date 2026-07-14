package io.deepmanapps.projectos.domain.port.out;

import io.deepmanapps.projectos.domain.model.WorkEffortReview;

public interface WorkEffortReviewRepository {
    WorkEffortReview save(WorkEffortReview review);
}

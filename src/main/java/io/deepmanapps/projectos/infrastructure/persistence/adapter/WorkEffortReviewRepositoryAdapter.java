package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortReview;
import io.deepmanapps.projectos.domain.port.out.WorkEffortReviewRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortReviewMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortReviewJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortReviewRepositoryAdapter implements WorkEffortReviewRepository {

    private final WorkEffortReviewJpaRepository jpaRepository;
    private final WorkEffortReviewMapper mapper;

    @Override
    public WorkEffortReview save(WorkEffortReview review) {
        var entity = mapper.toEntity(review);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortReview;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortReviewJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortReviewMapper {

    private final WorkEffortMapper workEffortMapper;
    private final UserLoginMapper userLoginMapper;
    private final StatusItemMapper statusItemMapper;

    public WorkEffortReview toDomain(WorkEffortReviewJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortReview.builder()
                .reviewDate(entity.getReviewDate())
                .postedAnonymous(entity.getPostedAnonymous())
                .rating(entity.getRating())
                .reviewText(entity.getReviewText())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .userLogin(userLoginMapper.toDomain(entity.getUserLogin()))
                .status(statusItemMapper.toDomain(entity.getStatus()))
                .build();
    }

    public WorkEffortReviewJpaEntity toEntity(WorkEffortReview domain) {
        if (domain == null) return null;
        WorkEffortReviewJpaEntity entity = new WorkEffortReviewJpaEntity();
        entity.setReviewDate(domain.getReviewDate());
        entity.setPostedAnonymous(domain.getPostedAnonymous());
        entity.setRating(domain.getRating());
        entity.setReviewText(domain.getReviewText());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setUserLogin(userLoginMapper.toEntity(domain.getUserLogin()));
        entity.setStatus(statusItemMapper.toEntity(domain.getStatus()));
        return entity;
    }
}

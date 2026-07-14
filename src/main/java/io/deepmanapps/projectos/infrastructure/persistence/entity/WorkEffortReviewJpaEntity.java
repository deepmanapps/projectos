package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_review")
@Data
@IdClass(WorkEffortReviewId.class)
public class WorkEffortReviewJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userLoginId")
    private UserLoginJpaEntity userLogin;

    @Id
    private LocalDateTime reviewDate;

    private Boolean postedAnonymous;
    private Double rating;
    @Lob
    private String reviewText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId")
    private StatusItemJpaEntity status;
}

package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_content")
@Data
@IdClass(WorkEffortContentId.class)
public class WorkEffortContentJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contentId")
    private ContentJpaEntity content;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortContentTypeId")
    private WorkEffortContentTypeJpaEntity workEffortContentType;

    @Id
    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
}

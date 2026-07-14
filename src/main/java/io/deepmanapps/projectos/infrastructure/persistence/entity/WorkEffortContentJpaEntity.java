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
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "work_effort_content_type_id")
    private String workEffortContentTypeId;

    @Id
    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", insertable = false, updatable = false)
    private ContentJpaEntity content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_content_type_id", insertable = false, updatable = false)
    private WorkEffortContentTypeJpaEntity workEffortContentType;

    private LocalDateTime thruDate;
}

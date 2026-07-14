package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_note")
@Data
@IdClass(WorkEffortNoteId.class)
public class WorkEffortNoteJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "noteId")
    private NoteDataJpaEntity note;

    private Boolean internalNote;
}

package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortNote;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortNoteJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortNoteMapper {

    private final WorkEffortMapper workEffortMapper;
    private final NoteDataMapper noteDataMapper;

    public WorkEffortNote toDomain(WorkEffortNoteJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortNote.builder()
                .internalNote(entity.getInternalNote())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .note(noteDataMapper.toDomain(entity.getNote()))
                .build();
    }

    public WorkEffortNoteJpaEntity toEntity(WorkEffortNote domain) {
        if (domain == null) return null;
        WorkEffortNoteJpaEntity entity = new WorkEffortNoteJpaEntity();
        entity.setInternalNote(domain.getInternalNote());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setNote(noteDataMapper.toEntity(domain.getNote()));
        return entity;
    }
}

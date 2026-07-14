package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.NoteData;
import io.deepmanapps.projectos.infrastructure.persistence.entity.NoteDataJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class NoteDataMapper {
    public NoteData toDomain(NoteDataJpaEntity entity) {
        if (entity == null) return null;
        return NoteData.builder().noteId(entity.getNoteId()).build();
    }

    public NoteDataJpaEntity toEntity(NoteData domain) {
        if (domain == null) return null;
        NoteDataJpaEntity entity = new NoteDataJpaEntity();
        entity.setNoteId(domain.getNoteId());
        return entity;
    }
}

package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortNote;
import io.deepmanapps.projectos.domain.port.out.WorkEffortNoteRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortNoteMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortNoteJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortNoteRepositoryAdapter implements WorkEffortNoteRepository {

    private final WorkEffortNoteJpaRepository jpaRepository;
    private final WorkEffortNoteMapper mapper;

    @Override
    public WorkEffortNote save(WorkEffortNote note) {
        var entity = mapper.toEntity(note);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}

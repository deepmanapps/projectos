package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.TimeEntry;
import io.deepmanapps.projectos.domain.port.out.TimeEntryRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.TimeEntryMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.TimeEntryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TimeEntryRepositoryAdapter implements TimeEntryRepository {

    private final TimeEntryJpaRepository timeEntryJpaRepository;
    private final TimeEntryMapper timeEntryMapper;

    @Override
    public Optional<TimeEntry> findById(String timeEntryId) {
        return timeEntryJpaRepository.findById(timeEntryId)
                .map(timeEntryMapper::toDomain);
    }

    @Override
    public TimeEntry save(TimeEntry timeEntry) {
        var entity = timeEntryMapper.toEntity(timeEntry);
        var savedEntity = timeEntryJpaRepository.save(entity);
        return timeEntryMapper.toDomain(savedEntity);
    }
}

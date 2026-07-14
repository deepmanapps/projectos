package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.Timesheet;
import io.deepmanapps.projectos.domain.port.out.TimesheetRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.TimesheetMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.TimesheetJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TimesheetRepositoryAdapter implements TimesheetRepository {

    private final TimesheetJpaRepository timesheetJpaRepository;
    private final TimesheetMapper timesheetMapper;

    @Override
    public Optional<Timesheet> findById(String timesheetId) {
        return timesheetJpaRepository.findById(timesheetId)
                .map(timesheetMapper::toDomain);
    }

    @Override
    public Timesheet save(Timesheet timesheet) {
        var entity = timesheetMapper.toEntity(timesheet);
        var savedEntity = timesheetJpaRepository.save(entity);
        return timesheetMapper.toDomain(savedEntity);
    }
}

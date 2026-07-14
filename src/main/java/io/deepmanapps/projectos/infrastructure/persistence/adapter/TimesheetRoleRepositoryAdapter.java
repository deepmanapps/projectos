package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.TimesheetRole;
import io.deepmanapps.projectos.domain.port.out.TimesheetRoleRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.TimesheetRoleMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.TimesheetRoleJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TimesheetRoleRepositoryAdapter implements TimesheetRoleRepository {

    private final TimesheetRoleJpaRepository jpaRepository;
    private final TimesheetRoleMapper mapper;

    @Override
    public TimesheetRole save(TimesheetRole timesheetRole) {
        var entity = mapper.toEntity(timesheetRole);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<TimesheetRole> findByTimesheetId(String timesheetId) {
        return jpaRepository.findByTimesheet_TimesheetId(timesheetId).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

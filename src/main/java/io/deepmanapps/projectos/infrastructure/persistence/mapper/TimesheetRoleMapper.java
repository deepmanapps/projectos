package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.TimesheetRole;
import io.deepmanapps.projectos.infrastructure.persistence.entity.TimesheetRoleJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TimesheetRoleMapper {

    private final TimesheetMapper timesheetMapper;

    public TimesheetRole toDomain(TimesheetRoleJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return TimesheetRole.builder()
                .partyId(entity.getPartyId())
                .roleTypeId(entity.getRoleTypeId())
                .timesheet(timesheetMapper.toDomain(entity.getTimesheet()))
                .build();
    }

    public TimesheetRoleJpaEntity toEntity(TimesheetRole domain) {
        if (domain == null) {
            return null;
        }
        TimesheetRoleJpaEntity entity = new TimesheetRoleJpaEntity();
        entity.setPartyId(domain.getPartyId());
        entity.setRoleTypeId(domain.getRoleTypeId());
        entity.setTimesheet(timesheetMapper.toEntity(domain.getTimesheet()));
        return entity;
    }
}

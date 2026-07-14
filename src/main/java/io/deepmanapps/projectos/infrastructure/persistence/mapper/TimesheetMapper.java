package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Timesheet;
import io.deepmanapps.projectos.infrastructure.persistence.entity.TimesheetJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class TimesheetMapper {

    private final TimeEntryMapper timeEntryMapper;
    private final TimesheetRoleMapper timesheetRoleMapper;

    public Timesheet toDomain(TimesheetJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return Timesheet.builder()
                .timesheetId(entity.getTimesheetId())
                .partyId(entity.getPartyId())
                .clientPartyId(entity.getClientPartyId())
                .statusId(entity.getStatusId())
                .approvedByUserLoginId(entity.getApprovedByUserLoginId())
                .comments(entity.getComments())
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .timeEntries(entity.getTimeEntries() != null ? entity.getTimeEntries().stream().map(timeEntryMapper::toDomain).collect(Collectors.toList()) : null)
                .roles(entity.getRoles() != null ? entity.getRoles().stream().map(timesheetRoleMapper::toDomain).collect(Collectors.toList()) : null)
                .build();
    }

    public TimesheetJpaEntity toEntity(Timesheet domain) {
        if (domain == null) {
            return null;
        }
        TimesheetJpaEntity entity = new TimesheetJpaEntity();
        entity.setTimesheetId(domain.getTimesheetId());
        entity.setPartyId(domain.getPartyId());
        entity.setClientPartyId(domain.getClientPartyId());
        entity.setStatusId(domain.getStatusId());
        entity.setApprovedByUserLoginId(domain.getApprovedByUserLoginId());
        entity.setComments(domain.getComments());
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        if (domain.getTimeEntries() != null) {
            entity.setTimeEntries(domain.getTimeEntries().stream().map(timeEntryMapper::toEntity).collect(Collectors.toList()));
            entity.getTimeEntries().forEach(t -> t.setTimesheet(entity));
        }
        if (domain.getRoles() != null) {
            entity.setRoles(domain.getRoles().stream().map(timesheetRoleMapper::toEntity).collect(Collectors.toList()));
            entity.getRoles().forEach(r -> r.setTimesheet(entity));
        }
        return entity;
    }
}

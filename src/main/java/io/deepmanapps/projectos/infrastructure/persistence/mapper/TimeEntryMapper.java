package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.TimeEntry;
import io.deepmanapps.projectos.infrastructure.persistence.entity.TimeEntryJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TimeEntryMapper {

    private final WorkEffortMapper workEffortMapper;
    private final TimesheetMapper timesheetMapper;

    public TimeEntry toDomain(TimeEntryJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return TimeEntry.builder()
                .timeEntryId(entity.getTimeEntryId())
                .partyId(entity.getPartyId())
                .rateTypeId(entity.getRateTypeId())
                .invoiceId(entity.getInvoiceId())
                .invoiceItemSeqId(entity.getInvoiceItemSeqId())
                .comments(entity.getComments())
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .hours(entity.getHours())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .timesheet(timesheetMapper.toDomain(entity.getTimesheet()))
                .build();
    }

    public TimeEntryJpaEntity toEntity(TimeEntry domain) {
        if (domain == null) {
            return null;
        }
        TimeEntryJpaEntity entity = new TimeEntryJpaEntity();
        entity.setTimeEntryId(domain.getTimeEntryId());
        entity.setPartyId(domain.getPartyId());
        entity.setRateTypeId(domain.getRateTypeId());
        entity.setInvoiceId(domain.getInvoiceId());
        entity.setInvoiceItemSeqId(domain.getInvoiceItemSeqId());
        entity.setComments(domain.getComments());
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setHours(domain.getHours());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setTimesheet(timesheetMapper.toEntity(domain.getTimesheet()));
        return entity;
    }
}

package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortEventReminder;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortEventReminderJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortEventReminderMapper {

    private final WorkEffortMapper workEffortMapper;
    private final ContactMechMapper contactMechMapper;
    private final PartyMapper partyMapper;

    public WorkEffortEventReminder toDomain(WorkEffortEventReminderJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortEventReminder.builder()
                .sequenceId(entity.getSequenceId())
                .reminderDateTime(entity.getReminderDateTime())
                .repeatCount(entity.getRepeatCount())
                .repeatInterval(entity.getRepeatInterval())
                .currentCount(entity.getCurrentCount())
                .reminderOffset(entity.getReminderOffset())
                .localeId(entity.getLocaleId())
                .timeZoneId(entity.getTimeZoneId())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .contactMech(contactMechMapper.toDomain(entity.getContactMech()))
                .party(partyMapper.toDomain(entity.getParty()))
                .build();
    }

    public WorkEffortEventReminderJpaEntity toEntity(WorkEffortEventReminder domain) {
        if (domain == null) return null;
        WorkEffortEventReminderJpaEntity entity = new WorkEffortEventReminderJpaEntity();
        entity.setSequenceId(domain.getSequenceId());
        entity.setReminderDateTime(domain.getReminderDateTime());
        entity.setRepeatCount(domain.getRepeatCount());
        entity.setRepeatInterval(domain.getRepeatInterval());
        entity.setCurrentCount(domain.getCurrentCount());
        entity.setReminderOffset(domain.getReminderOffset());
        entity.setLocaleId(domain.getLocaleId());
        entity.setTimeZoneId(domain.getTimeZoneId());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setContactMech(contactMechMapper.toEntity(domain.getContactMech()));
        entity.setParty(partyMapper.toEntity(domain.getParty()));
        return entity;
    }
}

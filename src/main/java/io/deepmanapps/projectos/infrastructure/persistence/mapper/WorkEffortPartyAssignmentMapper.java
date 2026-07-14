package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.WorkEffortPartyAssignment;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortPartyAssignmentJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortPartyAssignmentMapper {

    private final WorkEffortMapper workEffortMapper;
    private final PartyMapper partyMapper;
    private final RoleTypeMapper roleTypeMapper;
    private final UserLoginMapper userLoginMapper;
    private final StatusItemMapper statusItemMapper;
    private final EnumerationMapper enumerationMapper;
    private final FacilityMapper facilityMapper;

    public WorkEffortPartyAssignment toDomain(WorkEffortPartyAssignmentJpaEntity entity) {
        if (entity == null) return null;
        return WorkEffortPartyAssignment.builder()
                .fromDate(entity.getFromDate())
                .thruDate(entity.getThruDate())
                .statusDateTime(entity.getStatusDateTime())
                .comments(entity.getComments())
                .mustRsvp(entity.getMustRsvp())
                .workEffort(workEffortMapper.toDomain(entity.getWorkEffort()))
                .party(partyMapper.toDomain(entity.getParty()))
                .roleType(roleTypeMapper.toDomain(entity.getRoleType()))
                .assignedByUserLogin(userLoginMapper.toDomain(entity.getAssignedByUserLogin()))
                .status(statusItemMapper.toDomain(entity.getStatus()))
                .expectationEnum(enumerationMapper.toDomain(entity.getExpectationEnum()))
                .delegateReasonEnum(enumerationMapper.toDomain(entity.getDelegateReasonEnum()))
                .facility(facilityMapper.toDomain(entity.getFacility()))
                .availabilityStatus(statusItemMapper.toDomain(entity.getAvailabilityStatus()))
                .build();
    }

    public WorkEffortPartyAssignmentJpaEntity toEntity(WorkEffortPartyAssignment domain) {
        if (domain == null) return null;
        WorkEffortPartyAssignmentJpaEntity entity = new WorkEffortPartyAssignmentJpaEntity();
        entity.setFromDate(domain.getFromDate());
        entity.setThruDate(domain.getThruDate());
        entity.setStatusDateTime(domain.getStatusDateTime());
        entity.setComments(domain.getComments());
        entity.setMustRsvp(domain.getMustRsvp());
        entity.setWorkEffort(workEffortMapper.toEntity(domain.getWorkEffort()));
        entity.setParty(partyMapper.toEntity(domain.getParty()));
        entity.setRoleType(roleTypeMapper.toEntity(domain.getRoleType()));
        entity.setAssignedByUserLogin(userLoginMapper.toEntity(domain.getAssignedByUserLogin()));
        entity.setStatus(statusItemMapper.toEntity(domain.getStatus()));
        entity.setExpectationEnum(enumerationMapper.toEntity(domain.getExpectationEnum()));
        entity.setDelegateReasonEnum(enumerationMapper.toEntity(domain.getDelegateReasonEnum()));
        entity.setFacility(facilityMapper.toEntity(domain.getFacility()));
        entity.setAvailabilityStatus(statusItemMapper.toEntity(domain.getAvailabilityStatus()));
        return entity;
    }
}

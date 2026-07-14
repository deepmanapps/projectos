package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.TimesheetRoleJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.TimesheetRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TimesheetRoleJpaRepository extends JpaRepository<TimesheetRoleJpaEntity, TimesheetRoleId> {
    List<TimesheetRoleJpaEntity> findByTimesheet_TimesheetId(String timesheetId);
}

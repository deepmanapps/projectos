package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "time_entry")
@Data
public class TimeEntryJpaEntity {

    @Id
    private String timeEntryId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "rate_type_id")
    private String rateTypeId;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Lob
    private String comments;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    private Double hours;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timesheetId")
    private TimesheetJpaEntity timesheet;
}

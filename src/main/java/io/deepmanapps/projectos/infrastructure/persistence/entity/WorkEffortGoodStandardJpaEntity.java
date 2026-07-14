package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_good_standard")
@Data
@IdClass(WorkEffortGoodStandardId.class)
public class WorkEffortGoodStandardJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private ProductJpaEntity product;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortGoodStdTypeId")
    private WorkEffortGoodStandardTypeJpaEntity workEffortGoodStdType;

    @Id
    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
    private Double estimatedQuantity;
    private BigDecimal estimatedCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId")
    private StatusItemJpaEntity status;
}

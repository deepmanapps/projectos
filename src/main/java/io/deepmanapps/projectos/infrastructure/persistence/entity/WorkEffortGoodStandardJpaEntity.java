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
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "work_effort_good_std_type_id")
    private String workEffortGoodStdTypeId;

    @Id
    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductJpaEntity product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_good_std_type_id", insertable = false, updatable = false)
    private WorkEffortGoodStandardTypeJpaEntity workEffortGoodStdType;

    private LocalDateTime thruDate;
    private Double estimatedQuantity;
    private BigDecimal estimatedCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId")
    private StatusItemJpaEntity status;
}

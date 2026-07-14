package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contact_mech")
@Data
public class ContactMechJpaEntity {
    @Id
    private String contactMechId;
}

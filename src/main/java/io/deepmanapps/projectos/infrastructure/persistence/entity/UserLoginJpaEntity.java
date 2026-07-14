package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_login")
@Data
public class UserLoginJpaEntity {
    @Id
    private String userLoginId;
}

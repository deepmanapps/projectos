package io.deepmanapps.projectos.infrastructure.persistence.mapper;

import io.deepmanapps.projectos.domain.model.Product;
import io.deepmanapps.projectos.infrastructure.persistence.entity.ProductJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toDomain(ProductJpaEntity entity) {
        if (entity == null) return null;
        return Product.builder().productId(entity.getProductId()).build();
    }

    public ProductJpaEntity toEntity(Product domain) {
        if (domain == null) return null;
        ProductJpaEntity entity = new ProductJpaEntity();
        entity.setProductId(domain.getProductId());
        return entity;
    }
}

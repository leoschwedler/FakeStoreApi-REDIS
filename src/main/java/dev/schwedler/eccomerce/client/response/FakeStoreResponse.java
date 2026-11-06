package dev.schwedler.eccomerce.client.response;

import java.io.Serializable;
import java.math.BigDecimal;

public record FakeStoreResponse(
        Long id,
        String title,
        BigDecimal price,
        String description,
        String category,
        String image
) implements Serializable {
}

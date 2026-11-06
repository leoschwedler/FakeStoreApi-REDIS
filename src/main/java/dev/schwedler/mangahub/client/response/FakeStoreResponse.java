package dev.schwedler.mangahub.client.response;

import java.math.BigDecimal;

public record FakeStoreResponse(
        Long id,
        String title,
        BigDecimal price,
        String description,
        String category,
        String image
) {
}

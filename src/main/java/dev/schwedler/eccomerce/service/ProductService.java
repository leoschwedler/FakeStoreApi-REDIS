package dev.schwedler.eccomerce.service;

import dev.schwedler.eccomerce.client.FakeStoreClient;
import dev.schwedler.eccomerce.client.response.FakeStoreResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final FakeStoreClient fakeStoreClient;

    @Cacheable(value = "products")
    public List<FakeStoreResponse> findAll() {
        return fakeStoreClient.findAllProducts();
    }

    @Cacheable(value = "products", key = "#idProduct")
    public FakeStoreResponse findById(Long idProduct) {
        System.out.println("idProduct: " + idProduct);
        return fakeStoreClient.findProductById(idProduct);
    }
}

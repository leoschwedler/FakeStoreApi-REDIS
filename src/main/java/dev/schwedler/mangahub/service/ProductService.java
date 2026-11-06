package dev.schwedler.mangahub.service;

import dev.schwedler.mangahub.client.FakeStoreClient;
import dev.schwedler.mangahub.client.response.FakeStoreResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final FakeStoreClient fakeStoreClient;

    public List<FakeStoreResponse> findAll() {
        return fakeStoreClient.findAllProducts();
    }


    public FakeStoreResponse findById(Long id) {
        return fakeStoreClient.findProductById(id);
    }
}

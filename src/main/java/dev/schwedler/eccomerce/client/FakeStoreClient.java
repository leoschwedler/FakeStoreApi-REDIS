package dev.schwedler.eccomerce.client;

import dev.schwedler.eccomerce.client.response.FakeStoreResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "FakeStoreClient", url = "${api.url}")
public interface FakeStoreClient {

    @GetMapping(value = "/products")
    List<FakeStoreResponse> findAllProducts ();


    @GetMapping(value = "/products/{id}")
    FakeStoreResponse findProductById(@PathVariable Long id);

}



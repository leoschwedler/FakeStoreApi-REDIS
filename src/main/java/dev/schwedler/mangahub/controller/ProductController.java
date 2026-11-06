package dev.schwedler.mangahub.controller;

import dev.schwedler.mangahub.client.response.FakeStoreResponse;
import dev.schwedler.mangahub.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public ResponseEntity<List<FakeStoreResponse>> findAll(){
      return  ResponseEntity.ok(service.findAll());
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<FakeStoreResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }
}

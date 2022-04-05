package com.credentials.apims.service;

import com.credentials.apims.model.ProductRequest;
import com.credentials.apims.model.ProductResponse;
import org.springframework.http.ResponseEntity;

public interface ApigeeService {
    ProductResponse getData();

    ResponseEntity<String> createProduct(ProductRequest productRequest, String organizationName);

    ProductResponse createProxy();

    ProductResponse createDeveloper();

    ProductResponse createApp();
}

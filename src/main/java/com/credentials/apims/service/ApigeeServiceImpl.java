package com.credentials.apims.service;

import com.credentials.apims.model.ProductRequest;
import com.credentials.apims.model.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApigeeServiceImpl implements ApigeeService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public ProductResponse getData() {
        return null;
    }

    @Override
    public ResponseEntity<String> createProduct(ProductRequest productRequest, String organizationName) {
        ResponseEntity<String> message = restTemplate.exchange("https://api.enterprise.apigee.com/v1/organizations/" + organizationName + "apiproducts",
                HttpMethod.POST, requestEntity(productRequest), String.class);
        return new ResponseEntity<>("API Product Created", HttpStatus.CREATED);
    }

    private HttpEntity<?> requestEntity(ProductRequest productRequest) {

        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth("");
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(productRequest, headers);
    }

    @Override
    public ProductResponse createProxy() {
        return null;
    }

    @Override
    public ProductResponse createDeveloper() {
        return null;
    }

    @Override
    public ProductResponse createApp() {
        return null;
    }
}

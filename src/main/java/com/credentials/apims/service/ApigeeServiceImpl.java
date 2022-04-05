package com.credentials.apims.service;

import com.credentials.apims.model.ProductRequest;
import com.credentials.apims.model.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        String response = restTemplate.postForObject("https://api.enterprise.apigee.com/v1/organizations/" + organizationName + "/apiproducts",
                ProductRequest.class, String.class);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
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

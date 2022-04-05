package com.credentials.apims.controller;

import com.credentials.apims.model.ProductRequest;
import com.credentials.apims.model.ProductResponse;
import com.credentials.apims.service.ApigeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apigee")
public class ApigeeController {
    @Autowired
    private ApigeeService apigeeService;

    @GetMapping("/data")
    public ProductResponse getData() {
        return apigeeService.getData();
    }

    @PostMapping("/product/create")
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest productRequest) {
        String organizationName = "";
        return apigeeService.createProduct(productRequest, organizationName);
    }

    @PostMapping("/proxy/create")
    public ProductResponse createProxy() {
        return apigeeService.createProxy();
    }

    @PostMapping("/developer/create")
    public ProductResponse createDeveloper() {
        return apigeeService.createDeveloper();
    }

    @PostMapping("/apps/create")
    public ProductResponse createApp() {
        return apigeeService.createApp();
    }
}

package com.credentials.apims.controller;

import com.credentials.apims.model.ProductResponse;
import com.credentials.apims.service.ApigeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apigee")
public class ApigeeController {
    @Autowired
    private ApigeeService apigeeService;

    @GetMapping("/data")
    public ProductResponse getData(){
        return apigeeService.getData();
    }
}

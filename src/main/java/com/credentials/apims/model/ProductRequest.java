package com.credentials.apims.model;

import lombok.Data;

import java.util.List;
@Data
public class ProductRequest {
    private List<String> apiResources;
    private String approvalType;
    private List<Attributes> attributes;
    private String description;
    private String displayName;
    private List<String> environments;
    private String name;
    private List<String> proxies;
    private List<String> scopes;

}

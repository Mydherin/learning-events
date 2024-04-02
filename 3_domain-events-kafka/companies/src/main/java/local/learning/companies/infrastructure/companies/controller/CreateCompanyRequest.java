package local.learning.companies.infrastructure.companies.controller;

import lombok.Value;

@Value
public class CreateCompanyRequest {
    String id;
    String name;
}

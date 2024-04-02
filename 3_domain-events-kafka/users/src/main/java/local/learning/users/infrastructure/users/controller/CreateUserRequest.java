package local.learning.users.infrastructure.users.controller;

import lombok.Value;

@Value
public class CreateUserRequest {
    String id;
    String name;
    String companyId;
}

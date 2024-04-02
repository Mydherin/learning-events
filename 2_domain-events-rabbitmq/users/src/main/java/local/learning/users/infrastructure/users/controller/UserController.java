package local.learning.users.infrastructure.users.controller;

import local.learning.users.application.users.CreateUserUseCase;
import local.learning.users.application.users.CreateUserUseCaseCommand;
import local.learning.users.domain.users.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    @PutMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody final CreateUserRequest request) {
        final var user = new User(request.getId(), request.getName(), request.getCompanyId());
        this.createUserUseCase.handle(new CreateUserUseCaseCommand(user));
        return ResponseEntity.ok("User created");
    }

}

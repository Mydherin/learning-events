package local.learning.users.application.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserUseCase {

    private final UserRepository userRepository;

    public void handle(final CreateUserUseCaseCommand command) {
        this.userRepository.save(command.getUser());
    }
}

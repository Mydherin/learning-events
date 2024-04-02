package local.learning.users.application.users;

import local.learning.users.domain.users.User;
import lombok.Data;

@Data
public class CreateUserUseCaseCommand {
    private final User user;
}

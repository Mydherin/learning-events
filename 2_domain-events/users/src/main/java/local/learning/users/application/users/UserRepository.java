package local.learning.users.application.users;

import local.learning.users.domain.users.User;

public interface UserRepository {

    void save(User user);

}

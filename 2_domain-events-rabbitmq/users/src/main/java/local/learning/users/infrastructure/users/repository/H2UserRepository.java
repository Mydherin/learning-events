package local.learning.users.infrastructure.users.repository;

import local.learning.users.application.users.UserRepository;
import local.learning.users.domain.users.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class H2UserRepository implements UserRepository {

    private final JpaUserDao jpaUserDao;

    public void save(final User user) {
        this.jpaUserDao.save(new UserDto(user.getId(), user.getName(), user.getCompanyId()));

    }

}

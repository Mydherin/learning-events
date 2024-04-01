package local.learning.users.infrastructure.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserDao extends JpaRepository<UserDto, String> {
}

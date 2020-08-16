package ru.titov.twitter.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.titov.twitter.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByActivationCode(String code);
}

package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);
}

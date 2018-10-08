package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.Level;

public interface LevelRepository extends JpaRepository<Level, Long> {
}

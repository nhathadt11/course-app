package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}

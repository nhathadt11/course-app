package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

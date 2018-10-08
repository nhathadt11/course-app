package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}

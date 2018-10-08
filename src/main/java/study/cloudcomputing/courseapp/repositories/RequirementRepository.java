package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {
}

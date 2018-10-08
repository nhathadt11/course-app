package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}

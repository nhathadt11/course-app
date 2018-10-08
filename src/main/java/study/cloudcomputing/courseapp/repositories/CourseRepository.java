package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

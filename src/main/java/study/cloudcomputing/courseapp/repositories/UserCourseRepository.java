package study.cloudcomputing.courseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import study.cloudcomputing.courseapp.entities.UserCourse;

public interface UserCourseRepository extends JpaRepository<UserCourse, Long> {
}

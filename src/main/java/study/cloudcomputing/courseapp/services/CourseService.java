package study.cloudcomputing.courseapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.Course;
import study.cloudcomputing.courseapp.errors.CourseNotFoundException;
import study.cloudcomputing.courseapp.repositories.*;

import java.util.List;

@Service
public class CourseService {
  private final CourseRepository courseRepository;

  @Autowired
  public CourseService(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public List<Course> findAll() {
    return courseRepository.findAll();
  }

  public Course create(Course course) {
    return courseRepository.save(course);
  }

  public Course update(Course course) {
    courseRepository
        .findById(course.getId())
        .orElseThrow(CourseNotFoundException::new);

    return courseRepository.save(course);
  }

  public void delete(long id) {
    Course found = courseRepository
        .findById(id)
        .orElseThrow(CourseNotFoundException::new);

    courseRepository.delete(found);
  }
}

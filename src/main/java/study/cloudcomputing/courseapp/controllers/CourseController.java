package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.cloudcomputing.courseapp.entities.Course;
import study.cloudcomputing.courseapp.errors.InvalidIdException;
import study.cloudcomputing.courseapp.services.CourseService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
  private final CourseService courseService;

  @Autowired
  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping
  public ResponseEntity<List<Course>> findAll() {
    List<Course> courseList = courseService.findAll();
    return ResponseEntity.ok(courseList);
  }

  @PostMapping
  public ResponseEntity<Course> create(Course course) {
    Course created = courseService.create(course);
    return ResponseEntity.created(URI.create("/courses")).body(created);
  }

  @PutMapping
  public ResponseEntity<Course> update(Course course) {
    Course updated = courseService.update(course);
    return ResponseEntity.ok(updated);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Course> delete(@PathVariable String id) {
    if (id.matches("^\\d+$")) {
      throw new InvalidIdException();
    }

    courseService.delete(Long.parseLong(id));

    return ResponseEntity
        .noContent()
        .build();
  }
}

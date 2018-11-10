package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.cloudcomputing.courseapp.entities.Course;
import study.cloudcomputing.courseapp.services.CourseService;
import study.cloudcomputing.courseapp.validations.PathValidator;

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

  @GetMapping("{id}")
  public ResponseEntity<Course> findById(@PathVariable String id) {
    long systemId = PathValidator.requireId(id);

    Course found = courseService.findById(systemId);

    return ResponseEntity.ok(found);
  }

  @PostMapping
  public ResponseEntity<Course> create(@RequestBody Course course) {
    Course created = courseService.create(course);
    return ResponseEntity.created(URI.create("/courses")).body(created);
  }

  @PutMapping
  public ResponseEntity<Course> update(@RequestBody Course course) {
    Course updated = courseService.update(course);
    return ResponseEntity.ok(updated);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Course> delete(@PathVariable String id) {
    long systemId = PathValidator.requireId(id);

    courseService.delete(systemId);

    return ResponseEntity
        .noContent()
        .build();
  }
}

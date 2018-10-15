package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.cloudcomputing.courseapp.entities.Subject;
import study.cloudcomputing.courseapp.services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
  private final SubjectService subjectService;

  @Autowired
  public SubjectController(SubjectService subjectService) {
    this.subjectService = subjectService;
  }

  @GetMapping
  public ResponseEntity<List<Subject>> findAll(){
    return ResponseEntity.ok(subjectService.findAll());
  }
}

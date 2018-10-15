package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.cloudcomputing.courseapp.entities.Level;
import study.cloudcomputing.courseapp.services.LevelService;

import java.util.List;

@RestController
@RequestMapping("/levels")
public class LevelController {
  private final LevelService levelService;

  @Autowired
  public LevelController(LevelService levelService) {
    this.levelService = levelService;
  }

  @GetMapping
  public ResponseEntity<List<Level>> findAll(){
    return ResponseEntity.ok(levelService.findAll());
  }
}

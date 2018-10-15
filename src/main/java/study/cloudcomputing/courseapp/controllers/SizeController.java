package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.cloudcomputing.courseapp.entities.Size;
import study.cloudcomputing.courseapp.services.SizeService;

import java.util.List;

@RestController
@RequestMapping("/sizes")
public class SizeController {
  private final SizeService sizeService;

  @Autowired
  public SizeController(SizeService sizeService) {
    this.sizeService = sizeService;
  }

  @GetMapping
  public ResponseEntity<List<Size>> findAll(){
    return ResponseEntity.ok(sizeService.findAll());
  }
}

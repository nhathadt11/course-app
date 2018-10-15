package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.cloudcomputing.courseapp.entities.SubCategory;
import study.cloudcomputing.courseapp.services.SubCategoryService;

import java.util.List;

@RestController
@RequestMapping("/subCategories")
public class SubCategoryController {
  private final SubCategoryService subCategoryService;

  @Autowired
  public SubCategoryController(SubCategoryService subCategoryService) {
    this.subCategoryService = subCategoryService;
  }

  @GetMapping
  public ResponseEntity<List<SubCategory>> findAll(){
    return ResponseEntity.ok(subCategoryService.findAll());
  }
}

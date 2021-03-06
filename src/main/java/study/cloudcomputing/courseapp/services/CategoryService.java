package study.cloudcomputing.courseapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.Category;
import study.cloudcomputing.courseapp.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
  private final CategoryRepository categoryRepository;

  @Autowired
  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public List<Category> findAll() {
    return categoryRepository.findAll();
  }
}

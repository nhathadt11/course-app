package study.cloudcomputing.courseapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.SubCategory;
import study.cloudcomputing.courseapp.repositories.SubCategoryRepository;

import java.util.List;

@Service
public class SubCategoryService {
  private final SubCategoryRepository subCategoryRepository;

  @Autowired
  public SubCategoryService(SubCategoryRepository subCategoryRepository) {
    this.subCategoryRepository = subCategoryRepository;
  }

  public List<SubCategory> findAll(){
    return subCategoryRepository.findAll();
  }
}

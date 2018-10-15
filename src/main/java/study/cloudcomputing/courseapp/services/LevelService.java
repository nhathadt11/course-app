package study.cloudcomputing.courseapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.Level;
import study.cloudcomputing.courseapp.repositories.LevelRepository;

import java.util.List;

@Service
public class LevelService {
  private final LevelRepository levelRepository;

  @Autowired
  public LevelService(LevelRepository levelRepository) {
    this.levelRepository = levelRepository;
  }

  public List<Level> findAll(){
    return levelRepository.findAll();
  }
}

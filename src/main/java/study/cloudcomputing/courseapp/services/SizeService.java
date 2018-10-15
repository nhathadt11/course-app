package study.cloudcomputing.courseapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.Size;
import study.cloudcomputing.courseapp.repositories.SizeRepository;

import java.util.List;

@Service
public class SizeService {
  private final SizeRepository sizeRepository;

  @Autowired
  public SizeService(SizeRepository sizeRepository) {
    this.sizeRepository = sizeRepository;
  }

  public List<Size> findAll(){
    return sizeRepository.findAll();
  }
}

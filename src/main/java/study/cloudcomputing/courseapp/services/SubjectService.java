package study.cloudcomputing.courseapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.Subject;
import study.cloudcomputing.courseapp.repositories.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {
  private final SubjectRepository subjectRepository;

  @Autowired
  public SubjectService(SubjectRepository subjectRepository) {
    this.subjectRepository = subjectRepository;
  }

  public List<Subject> findAll(){
    return subjectRepository.findAll();
  }
}

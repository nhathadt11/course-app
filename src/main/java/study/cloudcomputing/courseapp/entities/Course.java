package study.cloudcomputing.courseapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private long categoryId;
  private long subCategoryId;
  private long subjectId;
  private float price;
  private long levelId;
  private long sizeId;
  private String description;
  @Transient
  private List<Photo> photoList;
  @Transient
  private List<Requirement> requirementList;
}

package study.cloudcomputing.courseapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="\"User\"")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String username;
  private String password;
}

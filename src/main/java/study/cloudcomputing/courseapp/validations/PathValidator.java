package study.cloudcomputing.courseapp.validations;

import study.cloudcomputing.courseapp.errors.InvalidIdException;

public class PathValidator {
  public static long requireId(String id) {
    if (!id.matches("^\\d+$")) {
      throw new InvalidIdException();
    }

    return Long.parseLong(id);
  }
}

package study.cloudcomputing.courseapp.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Invalid id")
public class InvalidIdException extends RuntimeException {
}

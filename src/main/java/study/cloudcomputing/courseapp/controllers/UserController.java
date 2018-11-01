package study.cloudcomputing.courseapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.cloudcomputing.courseapp.entities.User;
import study.cloudcomputing.courseapp.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {
  private final UserService userService;
  private final BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  public UserController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.userService = userService;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @PostMapping("sign-up")
  public User signup(@RequestBody User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    return userService.create(user);
  }
}

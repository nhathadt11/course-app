package study.cloudcomputing.courseapp.configs.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import study.cloudcomputing.courseapp.entities.User;
import study.cloudcomputing.courseapp.repositories.UserRepository;

import static java.util.Collections.emptyList;

@Service
public class LocalUserDetailsService implements UserDetailsService {
  private UserRepository userRepository;

  public LocalUserDetailsService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository
        .findByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException(username));

    return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), emptyList());
  }
}

package study.cloudcomputing.courseapp.configs.security;

public final class AuthenticationContants {
  private AuthenticationContants() {
  }

  public static final long EXPIRATION_TIME = 864_000_000;
  public static final String HEADER_STRING = "Authorization";
  public static final String TOKEN_PREFIX = "Bearer ";
  public static final String SECRET = "s3cr3t";
  public static final String SIGN_UP_URL = "/users/sign-up";
  public static final String UNAUTHENTICATED_USER_URL = "/users/**";
}

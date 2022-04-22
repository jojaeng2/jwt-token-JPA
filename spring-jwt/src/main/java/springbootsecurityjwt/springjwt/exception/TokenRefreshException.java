package springbootsecurityjwt.springjwt.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class TokenRefreshException extends RuntimeException{
    private static final Long serialVersionUID = 1L;

    public TokenRefreshException(String token, String message) {
        super(String.format("Failed for [%s] : %s", token, message));
    }
}

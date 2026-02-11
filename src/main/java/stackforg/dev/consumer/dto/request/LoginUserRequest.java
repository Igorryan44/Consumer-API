package stackforg.dev.consumer.dto.request;

public record LoginUserRequest(
        String email,
        String userPassword
) {
}

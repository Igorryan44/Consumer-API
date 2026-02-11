package stackforg.dev.consumer.config;

import lombok.Builder;

@Builder
public record JWTUserData (
        Long userId,
        String email
) {}

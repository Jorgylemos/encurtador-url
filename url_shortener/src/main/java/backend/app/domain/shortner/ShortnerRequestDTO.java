package backend.app.domain.shortner;

import jakarta.validation.constraints.NotNull;

public record ShortnerRequestDTO(
		@NotNull(message = "Url é obrigatório") String originalUrl) {
}

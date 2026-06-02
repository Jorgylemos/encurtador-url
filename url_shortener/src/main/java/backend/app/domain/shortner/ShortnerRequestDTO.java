package backend.app.domain.shortner;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public record ShortnerRequestDTO(
		@NotNull(message = "Url é obrigatório") String original_url,
		@Nullable String custom_alias) {
}

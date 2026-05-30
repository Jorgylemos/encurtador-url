package backend.app.domain.user;

import jakarta.validation.constraints.NotNull;

public record UserRequestDTO(
		@NotNull(message = "Nome é obrigatório") String name,
		@NotNull(message = "Email é obrigatório") String email) {
}

package backend.app.domain.user;

import java.util.Date;
import java.util.UUID;

public record UserResponseDTO(
		UUID id,
		String name,
		String email,
		Date creationDate,
		Date lastLogin) {
}

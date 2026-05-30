package backend.app.domain.shortner;

import java.util.Date;
import java.util.UUID;

public record ShortnerResponseDTO(
		UUID id,
		String originalUrl,
		Date creationDate,
		Date expirationDate) {
}

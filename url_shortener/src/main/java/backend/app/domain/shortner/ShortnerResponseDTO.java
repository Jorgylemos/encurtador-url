package backend.app.domain.shortner;

import java.util.Date;
import java.util.UUID;

public record ShortnerResponseDTO(
		UUID id,
		String originalUrl,
		String customAlias,
		Date creationDate,
		Date expirationDate) {
}

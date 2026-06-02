package backend.app.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.app.domain.shortner.Shortner;
import backend.app.domain.shortner.ShortnerRequestDTO;
import backend.app.domain.shortner.ShortnerResponseDTO;
import backend.app.infrastructure.config.UrlShortEncoder;
import backend.app.infrastructure.mapper.ShortnerMapper;
import backend.app.infrastructure.persistance.ShortnerJpaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShortnerService {

	@Autowired
	private final ShortnerMapper mapper;

	private final UrlShortEncoder shortEncoder;
	ShortnerJpaRepository repository;

	public Shortner createUrl(ShortnerRequestDTO data) {

		if (!data.original_url().isEmpty() || !data.original_url().isBlank()) {
			throw new Error("Data is can't empty");
		}

		if (!data.custom_alias().isBlank() || !data.custom_alias().isEmpty()) {

			Shortner newShortner = mapper.toEntity(data);

			return this.repository.save(newShortner);
		}

		String hash = this.shortEncoder.generateUrlHash(data.original_url());

		Shortner newShortner = mapper.toEntity(data);

		return this.repository.save(newShortner);
	}

	public List<ShortnerResponseDTO> getUrls() {
		return this.repository.findAll()
				.stream()
				.map((shortner) -> this.mapper.toDto(shortner))
				.toList();

	}

}

package backend.app.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.app.domain.shortner.Shortner;
import backend.app.domain.shortner.ShortnerRequestDTO;
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


	List<Shortner> shortner = new ArrayList<Shortner>();

	public Shortner createUrl(ShortnerRequestDTO data) {

		if(!data.originalUrl().isEmpty() || !data.originalUrl().isBlank()) {
			throw new Error("Data is can't empty");
		}

		this.shortEncoder.generateUrlHash("");

		Shortner newShortner = mapper.toEntity(data);

		return this.repository.save(newShortner);
	}

	public List<Shortner> getUrls() {
		return shortner.stream().map((shortner) -> new Shortner()).toList();
	}

}

package backend.app.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.app.domain.shortner.Shortner;
import backend.app.domain.shortner.ShortnerRequestDTO;
import backend.app.infrastructure.config.UrlShortEncoder;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShortnerService {

	@Autowired
	private UrlShortEncoder shortEncoder;

	List<Shortner> shortner = new ArrayList<Shortner>();

	public Shortner createUrl(ShortnerRequestDTO data) {
		Shortner newShortner = new Shortner();

		shortner.add(newShortner);

		return newShortner;
	}

	public List<Shortner> getUrls() {
		return shortner.stream().map((shortner) -> new Shortner()).toList();
	}

}

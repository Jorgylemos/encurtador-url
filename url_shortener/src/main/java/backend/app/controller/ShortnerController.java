package backend.app.controller;

import org.springframework.web.bind.annotation.RestController;

import backend.app.application.ShortnerService;
import backend.app.domain.shortner.Shortner;
import backend.app.domain.shortner.ShortnerRequestDTO;
import backend.app.domain.shortner.ShortnerResponseDTO;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "/api/url")
@RequiredArgsConstructor
public class ShortnerController {

	private final ShortnerService shortnerService;

	@PostMapping("/")
	public ResponseEntity<Shortner> createUrl(@RequestBody ShortnerRequestDTO data) {
		Shortner shortner = new Shortner();

		return ResponseEntity.ok(shortner);
	}

	@GetMapping("/")
	public ResponseEntity<List<ShortnerResponseDTO>> getUrlData(ShortnerResponseDTO data) {

		return data;
	}

}

package backend.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(name = "/api/users")
@RequiredArgsConstructor
public class UserController {
	@PostMapping("/")
	public String postMethodName(@RequestBody String entity) {

		return entity;
	}

	@GetMapping("/")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}

}

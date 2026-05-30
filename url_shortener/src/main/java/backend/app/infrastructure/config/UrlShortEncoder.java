package backend.app.infrastructure.config;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UrlShortEncoder {

	@Bean
	String generateUrlHash(String url) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			String hashed = digest.digest(url.getBytes(StandardCharsets.UTF_8)).toString();

			return hashed;

		} catch (NoSuchAlgorithmException exception) {

			System.err.println(exception);
			exception.printStackTrace();

			return null;
		}

	}

}

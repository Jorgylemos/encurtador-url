package backend.app.infrastructure.config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64.Encoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UrlShortEncoder {

	private Encoder encoder;

	@Bean
	public String generateUrlHash(String url) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			digest.update(url.getBytes());

			return encoder.encodeToString(digest.digest());

			String hashed = digest.digest(url.getBytes(StandardCharsets.UTF_8)).toString();

		} catch (NoSuchAlgorithmException exception) {

			System.err.println(exception);
			exception.printStackTrace();

			return null;
		}

	}

}

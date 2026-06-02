package backend.app.domain.shortner;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "shortner")
@AllArgsConstructor
@NoArgsConstructor
public class Shortner {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	UUID id;

	String originalUrl;
	String customAlias;
	String hash;
	Date creationDate;
	Date expirationDate;
}

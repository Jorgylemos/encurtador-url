package backend.app.infrastructure.persistance;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.app.domain.shortner.Shortner;
import backend.app.domain.shortner.ShortnerRepository;

@Repository
public interface ShortnerJpaRepository extends JpaRepository<Shortner, UUID>, ShortnerRepository {
}

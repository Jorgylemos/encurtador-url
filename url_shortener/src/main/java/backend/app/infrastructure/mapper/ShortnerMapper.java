package backend.app.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import backend.app.domain.shortner.Shortner;
import backend.app.domain.shortner.ShortnerRequestDTO;
import backend.app.domain.shortner.ShortnerResponseDTO;

@Mapper(componentModel = "spring")
public interface ShortnerMapper {

	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "originalUrl", source = "originalUrl"),
		@Mapping(target = "creationDate", ignore = true),
		@Mapping(target = "expirationDate", ignore = true)
	})

	Shortner toEntity(ShortnerRequestDTO shortner);


	@Mappings({
		@Mapping(target = "originalUrl", source = "originalUrl"),
		@Mapping(target = "creationDate", source = "creationDate"),
		@Mapping(target = "expirationDate", source = "expirationDate")
	})

	ShortnerResponseDTO toDto(Shortner dto);
}

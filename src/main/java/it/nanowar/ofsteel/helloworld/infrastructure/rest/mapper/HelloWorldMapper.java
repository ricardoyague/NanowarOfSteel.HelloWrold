package it.nanowar.ofsteel.helloworld.infrastructure.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.nanowar.ofsteel.helloworld.domain.model.HelloWorldMessage;
import it.nanowar.ofsteel.helloworld.infrastructure.rest.dto.HelloWorldDto;
import it.nanowar.ofsteel.helloworld.infrastructure.shared.CommonMapperConfig;

@Mapper(config = CommonMapperConfig.class)
public interface HelloWorldMapper {

    @Mapping(target = "messages", expression = "java(helloWorldMessage.songRefrain().toArray(new String[0]))")
    HelloWorldDto toDto(HelloWorldMessage helloWorldMessage);

}

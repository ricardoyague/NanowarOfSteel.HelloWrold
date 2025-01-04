package it.nanowar.ofsteel.helloworld.infrastructure.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class HelloWorldDto {

    String[] messages;

}

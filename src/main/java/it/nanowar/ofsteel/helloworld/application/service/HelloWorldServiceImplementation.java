package it.nanowar.ofsteel.helloworld.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.nanowar.ofsteel.helloworld.domain.model.HelloWorldMessage;
import it.nanowar.ofsteel.helloworld.domain.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class HelloWorldServiceImplementation implements HelloWorldService{

    Integer foo;

    @Override
    public HelloWorldMessage songRefrain(Integer foo) {
        log.debug("[HelloWorldServiceImplementation::songRefrain] Foo value = {}.", foo);
        log.info("Hello World Programmer Start");
		HelloWorldMessage tizio = new HelloWorldMessage(foo);
		List<String> messages = tizio.songRefrain();
        messages.forEach((m) -> log.info(m));
		log.info("Program finish");
        return tizio;
    }

}

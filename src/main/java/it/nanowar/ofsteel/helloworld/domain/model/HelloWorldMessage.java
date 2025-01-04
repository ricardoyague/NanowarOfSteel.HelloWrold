package it.nanowar.ofsteel.helloworld.domain.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Value;

@Value
public class HelloWorldMessage {

    Integer foo;
    
    public List<String> songRefrain(){
		Integer messageNumber = (foo != null) ? foo : 1;
        List<String> messages = new ArrayList<>();
		for(int i=0;i<messageNumber;i++){
			messages.add("Hello World!");
		}
		int pippo = 0;
		while (pippo < messageNumber){
			messages.add("Hello World!");
			pippo++;
		}
		return messages;
	}

}

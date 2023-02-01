package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class EventPublisher {


	@MessageMapping("/update-socket")
	@SendTo("/topic/db-events")
	public Response publishSocketEvent(HelloMessage message) throws Exception {
		
		return new Response("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}

}

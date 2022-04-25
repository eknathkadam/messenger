package com.alphonsoftware.messenger;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;


@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//
//	public String getMessage() {
//		return "Hellow World@";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		System.out.println("Tests");
		return messageService.getAllMessages();
	}
}

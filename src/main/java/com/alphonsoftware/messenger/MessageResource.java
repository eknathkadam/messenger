package com.alphonsoftware.messenger;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.PathParam;
import java.util.*;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		System.out.println("Tests");
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_XML)
	public String getMessage(@PathParam("messageID") long message) {
		return "test";
	}
}

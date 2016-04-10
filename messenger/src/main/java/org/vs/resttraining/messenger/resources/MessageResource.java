package org.vs.resttraining.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vs.resttraining.messenger.model.Message;
import org.vs.resttraining.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService ms = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return this.ms.getAllMessages();
	}
	
	

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam ("messageId") long messageId) {
		return ms.getMessage(messageId);
	}
	
	
	
	
}
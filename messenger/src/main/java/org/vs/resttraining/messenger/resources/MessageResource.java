package org.vs.resttraining.messenger.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vs.resttraining.messenger.model.Message;
import org.vs.resttraining.messenger.resources.beans.MessageFilterBean;
import org.vs.resttraining.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService ms = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(@BeanParam MessageFilterBean mfb) {
		if (mfb.getYear() > 0 ){
			if (this.ms.getAllMessagesPerYear(mfb.getYear()).size() == 0 ){
				return null;
			}else return this.ms.getAllMessagesPerYear(mfb.getYear());			
		}else if ((mfb.getStart() > 0) && (mfb.getSize() > 0)){
			return this.ms.getAllMessagesPaginated(mfb.getStart(), mfb.getSize());
		}else{
			return this.ms.getAllMessages();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message  addMessage(Message message) {
		return this.ms.addMessage(message);
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId) {
		return this.ms.getMessage(messageId);
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message) {
		return this.ms.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message removeMessage(@PathParam("messageId") long messageId) {
		return this.ms.removeMessage(messageId);
	}
}

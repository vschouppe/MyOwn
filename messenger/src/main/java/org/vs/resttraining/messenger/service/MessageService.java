package org.vs.resttraining.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vs.resttraining.messenger.database.DatabaseClass;
import org.vs.resttraining.messenger.model.Message;
import org.vs.resttraining.messenger.profiles.Names;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1,"vincent m1",Names.VINCENT));
		messages.put(2L, new Message(2,"vincent m2", Names.VINCENT));
		messages.put(3L, new Message(3,"aimee m1", Names.AIMEE));
		
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() + 1); // id is amount of messages + 1
		this.messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage (Long id){
		return messages.remove(id);
	}
	
	public Message updateMessage (Message message){
		if (message.getId() <= 0){
			return null;
		}else{
			messages.put(message.getId(), message);
			return message;
		}
			
	}

	

}

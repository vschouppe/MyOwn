package org.vs.resttraining.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
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
		
		String n = new String("hey");
		System.out.println(n.toString());
		System.out.println(n.trim());
		System.out.println(n.equals(new String("hey")));
		System.out.println(n.equals(""));
		
		int i =32;
		long l = 1;
		double d = 45;
		
		
	}

	
	public List<Message> getAllMessages(){
		return new ArrayList(messages.values());
	}
	
	public List<Message> getAllMessagesPerYear(int year){
		List<Message> newL = new ArrayList();
		Calendar cal = Calendar.getInstance();
		for(Message m: messages.values()){
			cal.setTime(m.getCreated());
			if (cal.get(Calendar.YEAR) == year ){
				newL.add(m);
			}
		}		
		return newL;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size){
		List<Message> newL = new ArrayList(messages.values());
		if (start + size > newL.size()) return newL;	
		return newL.subList(start, start + size);	
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
		return this.messages.remove(id);
	}
	
	public Message updateMessage (Message message){
		if (message.getId() <= 0){
			return null;
		}else{
//			Iterator<Map.Entry<Long, Message>> messages = this.messages.entrySet().iterator();
//			while (messages.hasNext()) {
//			    Map.Entry<Long, Message> mes = messages.next();
//			    System.out.println("Key = " + mes.getKey() + ", Value = " + mes.getValue());
//			}
			this.messages.put(message.getId(), message);
			return message;
		}
			
	}

}

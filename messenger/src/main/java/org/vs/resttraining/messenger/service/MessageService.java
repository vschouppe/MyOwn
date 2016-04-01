package org.vs.resttraining.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.vs.resttraining.messenger.model.Message;
import org.vs.resttraining.messenger.profiles.Names;

public class MessageService {
	
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1000,"V message 1", Names.VINCENT);
		Message m2 = new Message(1001,"V message 2", Names.VINCENT);
		Message m3 = new Message(1002,"A message 1", Names.AIMEE);
		
		List<Message> list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;
	}
	
	
	

}

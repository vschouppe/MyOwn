package org.vs.resttraining.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.vs.resttraining.messenger.model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Message> profiles = new HashMap<>();
	
	//will build Hybernate db connection here.
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static void setMessages(Map<Long, Message> messages) {
		DatabaseClass.messages = messages;
	}
	public static Map<Long, Message> getProfiles() {
		return profiles;
	}
	public static void setProfiles(Map<Long, Message> profiles) {
		DatabaseClass.profiles = profiles;
	}
	
	
}

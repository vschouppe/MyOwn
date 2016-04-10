package org.vs.resttraining.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.vs.resttraining.messenger.model.Message;
import org.vs.resttraining.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	//will build Hybernate db connection here.
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static void setMessages(Map<Long, Message> messages) {
		DatabaseClass.messages = messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	public static void setProfiles(Map<String, Profile> profiles) {
		DatabaseClass.profiles = profiles;
	}
	
	
}

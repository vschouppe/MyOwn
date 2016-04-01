package org.vs.resttraining.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.vs.resttraining.messenger.profiles.Names;

@XmlRootElement()
public class Message {

	private long id;
	private String message;
	private Date created;
	private Names author;

	public Message() {

	}

	public Message(long id, String message, Names author) {
		super();
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Names getAuthor() {
		return author;
	}

	public void setAuthor(Names author) {
		this.author = author;
	}

}

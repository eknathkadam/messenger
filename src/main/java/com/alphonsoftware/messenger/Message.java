package com.alphonsoftware.messenger;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private long id;
	private Date createdDate;
	private String message;
	
	public Message() {
		super();
	}
	
	
	public Message(long id, String message, String createdBy) {
		super();
		this.id = id;
		this.message = message;
		this.createdBy = createdBy;
		this.createdDate = new Date();
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	private String createdBy;
	

}

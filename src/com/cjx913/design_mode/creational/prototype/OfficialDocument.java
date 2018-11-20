package com.cjx913.design_mode.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.Date;

public class OfficialDocument implements Serializable {
	private String title;
	private String[] mainDeliveryDepartment;
	private String text;
	private String publishDepartment;
	private Date publishDate;
	
	private Attachment attachment;

	public String getTitle() { 
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getMainDeliveryDepartment() {
		return mainDeliveryDepartment;
	}

	public void setMainDeliveryDepartment(String[] mainDeliveryDepartment) {
		this.mainDeliveryDepartment = mainDeliveryDepartment;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPublishDepartment() {
		return publishDepartment;
	}

	public void setPublishDepartment(String publishDepartment) {
		this.publishDepartment = publishDepartment;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	
	public OfficialDocument deepClone() throws IOException, ClassNotFoundException ,OptionalDataException{
		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(arrayOutputStream);
		objectOutputStream.writeObject(this);
		
		ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
		return (OfficialDocument) objectInputStream.readObject();
	}

}

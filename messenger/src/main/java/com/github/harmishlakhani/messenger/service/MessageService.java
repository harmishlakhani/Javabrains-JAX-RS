package com.github.harmishlakhani.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.github.harmishlakhani.messenger.database.DatabaseClass;
import com.github.harmishlakhani.messenger.exception.DataNotFoundException;
import com.github.harmishlakhani.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		Message m1 = new Message(1L, "Mahadev", "HCL");
		Message m2 = new Message(2L, "Jay MAa Mogal", "HCL");
		messages.put(1L, m1);
		messages.put(2L, m2);
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesForYear(int year) {
		List<Message> list = new ArrayList<Message>();
		Calendar calender = Calendar.getInstance();
		for(Message message : messages.values()) {
			calender.setTime(message.getCreated());
			if(calender.get(Calendar.YEAR) == year) {
				list.add(message);
			}
		}
		return list;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size) {
		List<Message> list = new ArrayList<Message>(messages.values());
		if(start + size > list.size())
			return new ArrayList<Message>();
		return list.subList(start, start + size);
	}
	
	public Message getMessage(long id) {
		Message message = messages.get(id);
		if(message == null)
			throw new DataNotFoundException("Message with id " + id + " not found");
		return message;
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}

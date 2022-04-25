package com.alphonsoftware.messenger;
import java.util.*;

public class MessageService {
	
	public List<Message>getAllMessages(){
		
		Message m1 = new Message(1L,"Hellow World","Eknath");
		Message m2 = new Message(2L,"Hellow Earth","Nirav");
		
		List<Message> l = new ArrayList<>();
		l.add(m1);
		l.add(m2);
		return l;
		
	}

}

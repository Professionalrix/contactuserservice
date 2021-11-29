package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	
	 List<Contact> list = List.of(
			 new Contact(1L,"a@gmail.com","dsfsfsff",1311L),
			 new Contact(2L,"asd@gmail.com","afdafd",1311L),
			new Contact (3L,"sdf@gmail.com","fdfd",1313L)
		);
	
	
	@Override 
	public List<Contact> getContact(Long userId){
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}



	
}

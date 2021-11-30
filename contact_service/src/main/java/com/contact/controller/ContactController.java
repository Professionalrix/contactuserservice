package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Contact;
import com.contact.service.ContactService;
 
@RestController
@RequestMapping("/contacts")
public class ContactController {
		
	@Autowired
	private ContactService contactService;
	
	
	
	@GetMapping("/users/{userId}")
	public List<Contact> getContacts(@PathVariable Long userId){
		
		return this.contactService.getContact(userId);
	}
	
	
	@GetMapping("/users")
	public List<Contact> getAllContacts(@PathVariable Long userId){
		
		return this.contactService.getContact(userId);
	}
	
	
	
	
}

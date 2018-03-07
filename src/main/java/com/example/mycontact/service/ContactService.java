package com.example.mycontact.service;

import java.util.List;

import com.example.mycontact.domain.Contact;

public interface ContactService {
	Iterable<Contact> findAll();
	
	List<Contact> findByString(String q);
	
	Contact findOne(long id);
	
	void save(Contact contact);
	
	void delete(long id);
}

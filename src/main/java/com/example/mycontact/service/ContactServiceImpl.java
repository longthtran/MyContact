package com.example.mycontact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mycontact.domain.Contact;
import com.example.mycontact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Iterable<Contact> findAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> findByString(String q) {
		// TODO Auto-generated method stub
		return contactRepository.findByNameContaining(q);
	}

	@Override
	public Contact findOne(long id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id).get();
	}

	@Override
	public void save(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
	}

}

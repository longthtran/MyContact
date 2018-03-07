package com.example.mycontact.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.mycontact.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findByNameContaining(String q);
}

package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.model.Event;
import com.example.app.repo.EventRepository;

@RepositoryRestController
public class EventController {

	@Autowired
	private EventRepository eventRepository;
	
	@PostMapping("/events/start/{id}")
	public ResponseEntity<String> start(@PathVariable Long id) {
		Event event = eventRepository.findById(id).get();
		
		if(event == null) {
			throw new ResourceNotFoundException();
		}
		event.setStarted(true);
		eventRepository.save(event);
		
		return ResponseEntity.ok(event.getName() + " has started..");
	}
}

package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.exception.AlreadyCheckedInException;
import com.example.app.model.Participant;
import com.example.app.repo.ParticipantRepository;

@RepositoryRestController
public class CheckInController {

	@Autowired
	private ParticipantRepository participantRepository; 
	
	@PostMapping("/events/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler persistentEntityResourceAssembler) {
		Participant participant = participantRepository.findById(id).get();
		if(id != null) {
			if(participant.getCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
			participant.setCheckedIn(true);
			participantRepository.save(participant);
		}
		
		return ResponseEntity.ok(persistentEntityResourceAssembler.toFullResource(participant));
	}
}

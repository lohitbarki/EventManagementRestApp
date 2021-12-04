package com.example.app.controller;

import com.example.app.model.Organizer;
import com.example.app.service.OrganizerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
public class OrganizerController {

	@Autowired
	private OrganizerService organizerService;
	
	@GetMapping("/oraganizers/")
	public List<Organizer> getAllOrganizers(){
		return organizerService.getList();
	}
}

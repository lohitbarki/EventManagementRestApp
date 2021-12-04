package com.example.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.app.model.Organizer;

@Component
public class OrganizerService {

	public List<Organizer> getList(){
		return Arrays.asList(new Organizer());
	}
}

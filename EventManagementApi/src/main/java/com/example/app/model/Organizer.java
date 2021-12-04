package com.example.app.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Organizer extends AbstractEntity {

	private String name;
	
	@OneToMany(mappedBy = "organizer")
	private Set<Event> events;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Organizer) obj).getId());
	}
}

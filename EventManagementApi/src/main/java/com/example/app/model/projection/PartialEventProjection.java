package com.example.app.model.projection;

import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.example.app.model.Event;


@Projection(name="partial", types = {Event.class})
public interface PartialEventProjection {

	String getName();
	
	ZonedDateTime getStartTime();
	
	ZonedDateTime getEndTime();
}

package com.example.app.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public class AbstractEntity {

	@Id
	@Column(nullable=false, updatable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@JsonIgnore
	@CreationTimestamp
	@Column(updatable = false)
	protected Instant timeStamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Instant getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}

}

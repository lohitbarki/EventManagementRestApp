package com.example.app.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.app.model.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long>{

}
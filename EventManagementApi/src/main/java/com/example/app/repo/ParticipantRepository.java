package com.example.app.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.app.model.*;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long>{

}
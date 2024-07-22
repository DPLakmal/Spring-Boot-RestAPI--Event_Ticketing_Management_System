package com.ems.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.ems.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
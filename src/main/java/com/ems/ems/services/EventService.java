package com.ems.ems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.ems.entities.Event;
import com.ems.ems.repositories.EventRepository;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event eventDetails) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            event.setEventName(eventDetails.getEventName());
            event.setLocation(eventDetails.getLocation());
            event.setEventDate(eventDetails.getEventDate());
            return eventRepository.save(event);
        } else {
            throw new RuntimeException("Event not found");
        }
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    // public Event registerAttendee(Long eventId, String attendee) {
    // Optional<Event> optionalEvent = eventRepository.findById(eventId);
    // if (optionalEvent.isPresent()) {
    // Event event = optionalEvent.get();
    // event.getAttendees().add(attendee);
    // return eventRepository.save(event);
    // } else {
    // throw new RuntimeException("Event not found");
    // }
    // }
}

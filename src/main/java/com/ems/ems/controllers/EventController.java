package com.ems.ems.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ems.ems.entities.Event;
import com.ems.ems.services.EventService;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "*")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event eventDetails) {
        return eventService.updateEvent(id, eventDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }

    // @PostMapping("/{id}/attendees")
    // public Event registerAttendee(@PathVariable Long id, @RequestBody String
    // attendee) {
    // return eventService.registerAttendee(id, attendee);
    // }

}

package com.example.eventmanagement.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.eventmanagement.exception.EventNotFoundException;
import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {

    private static final Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

    private final EventRepository repository;

    public EventServiceImpl(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public Event createEvent(Event event) {
        logger.info("Creating event: {}", event.getName());
        return repository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        logger.info("Fetching all events");
        return repository.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        logger.info("Fetching event with id {}", id);
        return repository.findById(id)
                .orElseThrow(() -> new EventNotFoundException("Event not found with id: " + id));
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        logger.info("Updating event with id {}", id);

        Event existing = repository.findById(id)
                .orElseThrow(() -> new EventNotFoundException("Event not found with id: " + id));

        existing.setName(event.getName());
        existing.setLocation(event.getLocation());
        existing.setDate(event.getDate());

        return repository.save(existing);
    }

    @Override
    public void deleteEvent(Long id) {
        logger.info("Deleting event with id {}", id);

        Event existing = repository.findById(id)
                .orElseThrow(() -> new EventNotFoundException("Event not found with id: " + id));

        repository.delete(existing);
    }
}

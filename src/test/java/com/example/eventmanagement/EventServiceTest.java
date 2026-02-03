package com.example.eventmanagement;

import java.util.List;

import com.example.eventmanagement.exception.EventNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;
import com.example.eventmanagement.service.EventServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EventServiceTest {

    @Mock
    private EventRepository repository;

    @InjectMocks
    private EventServiceImpl service;

    @Test
    void testCreateEvent() {
        Event event = new Event(1L, "Conference", "Delhi", "2026-02-10");
        when(repository.save(event)).thenReturn(event);

        Event saved = service.createEvent(event);

        assertEquals("Conference", saved.getName());
    }

    @Test
    void testGetAllEvents() {
        when(repository.findAll()).thenReturn(List.of(
                new Event(1L, "Meetup", "Mumbai", "2026-03-01")
        ));

        assertEquals(1, service.getAllEvents().size());
    }
    @Test
    void testGetEventById_NotFound() {
        when(repository.findById(99L)).thenReturn(java.util.Optional.empty());

        Exception exception = assertThrows(EventNotFoundException.class, () -> {
            service.getEventById(99L);
        });

        assertEquals("Event not found with id: 99", exception.getMessage());
    }

}

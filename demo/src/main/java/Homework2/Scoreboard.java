package Homework2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
@RequiredArgsConstructor
public class Scoreboard {

    private final TicketNumberGenerator ticketNumberGenerator;

    public Ticket newTicket() {
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        LocalDateTime moscowTime = LocalDateTime.now(zoneId);
        Ticket ticket = new Ticket(ticketNumberGenerator.createNewNumber(), moscowTime);
        return ticket;
    }
}
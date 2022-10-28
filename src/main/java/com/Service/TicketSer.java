package com.Service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Entity.Tickets;

@Service
public interface TicketSer {

	Tickets createTickets(Tickets ticket);
	
	Tickets updateTickets(Tickets ticket);
	
	Boolean deleteTicket(Long ticketId);
	
	List<Tickets> getAllTickets();
	
	List<Tickets> getByFirstName() throws SQLException;
	
	Tickets getById(Long ticketId);
}
